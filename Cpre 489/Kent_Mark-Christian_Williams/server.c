#include <stdio.h>
#include <sys/types.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <stdlib.h>

struct sockaddr_in srcIPAddr, dstIPAddr;

int main(){
	int srcIP = inet_addr("127.0.0.1");
	int srcPO = 63770;//last 5 digits of my student number

	int fd, n, sd;
	const char* buff[1528];

	srcIPAddr.sin_family = AF_INET;
	srcIPAddr.sin_port = srcPO;
	srcIPAddr.sin_addr.s_addr= srcIP;
	
	//trans/recieving socket
	fd = socket(PF_INET, SOCK_DGRAM,0);
	 if(fd < 0){
	  perror("Socket Error");
	}	
	
	bind(fd, &srcIPAddr, sizeof(srcIPAddr));
	

	int count = 0;
	
	
	for(;;){	

	  if(recvfrom(fd, buff, sizeof(buff), 0 , (struct sockaddr *)&srcIPAddr, sizeof(srcIPAddr))){
		count++;
	}
	  
	  
	  
	  
	  if(count % 10 == 0 && count != 0){
	    sendto(fd,count, sizeof(count),0,(struct sockaddr* )&srcIPAddr, sizeof(srcIPAddr));
	  }
	}	
}

