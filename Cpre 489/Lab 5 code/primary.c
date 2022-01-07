#include <stdio.h> 
#include <string.h>    
#include <sys/socket.h>    
#include <stdlib.h>
#include "ccitt16.h"
#include "utilities.h"
#include "introduceerror.h"

#define MAX(a,b) (((a)>(b))? (a) : (b))

void primary(int sockfd, double ber) {
	int read_size;
    	char msg[100], srv_reply[150];
	unsigned char packet[PACKET_SIZE];
	int currentPacket = 0;//keeps track of current packet of window frame
	int totalPacket = 0;//keeps track of window frame
	int packetCount = 0;//Total number of packets sent
	
    //keep communicating with server
    while(1)
    {
        	printf("Enter message : ");
		fgets(msg, 100 , stdin);//receiove message form user
        
		int messageSize = strlen(msg);//get size of message
		int numPackets = (messageSize+(DATA_LENGTH-1))/DATA_LENGTH;//calculate number of packets needed
		totalPacket += currentPacket;//adjust frame based on received ack packets
		currentPacket = 0;
		
		while(currentPacket < numPackets)//continue to send until we have received ack for all packets
		{
			int k = 0;//start at first packet of frame
			while( k < WINDOW_SIZE && currentPacket < numPackets)//send until end of frame
			{
				char buffer[DATA_LENGTH+1];
				//set memory, build and print packet, send packet to receiver
				memset(buffer, '\0', sizeof(buffer));
				strncpy(buffer, msg  + (currentPacket*DATA_LENGTH), DATA_LENGTH);
				buildPacket(packet, DATA_PACKET, buffer, totalPacket + currentPacket);
				printPacket(packet);
				IntroduceError(packet, ber);
				
				if( send(sockfd , packet, PACKET_SIZE, 0) < 0)
					perror("Send failed");
				//increase packet counts for frame, currentPacket, and total packets sent
				packetCount++;
				k++;
				currentPacket++;
			}
			printf("Window complete\n");
			printf("Packets sent: %d\n\n",k);
			printf("Server response:\n");
			
			int maxSqNum = 0;//store largest sq num that we can take
			int isNAK = 0;//boolean for if we received a nak packet
			int d = k;
			for(d; d > 0; d--)//check the three expected ack packets
			{
				if( (read_size = recv(sockfd , srv_reply , PACKET_SIZE , 0)) < 0)//receive packet
					perror("recv failed");

				printPacket(srv_reply);//print packet info
				
				switch(srv_reply[0])//check what type the packet is
				{
					case ACK_PACKET:
						maxSqNum = MAX(srv_reply[1] - totalPacket, maxSqNum);
						break;
					case NAK_PACKET:
						isNAK = 1;
					default:
						printf("UNDEFINED PACKET TYPE");
				}
			}
			
			currentPacket -= k;//assuming it is nak, return to beginning of frame
			if(!isNAK)
			{
				currentPacket = maxSqNum;//if not a nak, start frame at max sq num
			}
		
		}
		printf("Average transmission attempts per packet: %f\n",packetCount/14.0);//print average number of transmssions per packet
    }
  
}