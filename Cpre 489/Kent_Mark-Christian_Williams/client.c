#include <stdio.h>
#include <sys/types.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <stdlib.h>

struct sockaddr_in serverIPAddr;
void main(){
	

	int serverIP = inet_addr("127.0.0.1");// sets IP to this pc since the client and server will run on the same computer
	int serverPO = 63770;//last 5 digits of my student number


	float startTime = gettimeofday();	//gets start of day
	int m = 0;				
	int R = system("ping 127.0.0.1");	// sets R to thr round trip of the ping
	int fd, n;
	const char* buff[1528];

	serverIPAddr.sin_family = AF_INET;	// sets the serverIPAddr variables
	serverIPAddr.sin_port = serverPO;
	serverIPAddr.sin_addr.s_addr= serverIP;

	//trans/recieving socket
	fd = socket(PF_INET, SOCK_DGRAM,0);
	 if(fd < 0){
	  perror("Socket Error");
	}	

	//binds socket
	bind(fd, &serverIPAddr, sizeof(serverIPAddr));
	
	float oldthrough; // old throughput
	float newthrough; // new throughout
	
	while(oldthrough - newthrough > .05){ // until old - new < 5%
		oldthrough = newthrough;
		
		//printf("Here");
		
		if(n = recvfrom(fd, m, sizeof(m), 0 , (struct sockaddr *)&serverIPAddr, sizeof(serverIPAddr))){ // if recieved
			float endTime = gettimeofday();		// set endtime
			newthrough = (m*1518*8)/(endTime - startTime - R);	// calculate throughput
		}	
		sendto(fd,n*2, sizeof(n*2),0,(struct sockaddr* )&serverIPAddr, sizeof(serverIPAddr)); // send with n*2 bits
		
	}
	
	
}
