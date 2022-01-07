#include <netdb.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/socket.h>
#define MAX 80
#define PORT 8080
#define SA struct sockaddr

/* void get_file(int client_sock, char* fname){
	char buffer[MAX_LENGTH];
	bzero(buffer,MAX_LENGTH);
	recv(sockfd);
	bzero(buffer, MAX_LENGTH);
	fgets(buffer, MAX_LENGTH, stdin);
	buffer[strcspn(buffer, "\n")] = 0;
	func(sockfd);
} */

void func(int sockfd)
{
    char buff[MAX];
    int n;
    for (;;) {
        bzero(buff, sizeof(buff));
        printf("Enter the string : ");
        n = 0;
        while ((buff[n++] = getchar()) != '\n')
            ;
        write(sockfd, buff, sizeof(buff));
        bzero(buff, sizeof(buff));
        read(sockfd, buff, sizeof(buff));
        printf("From Server : %s", buff);
        if ((strncmp(buff, "exit", 4)) == 0) {
            printf("Client Exit...\n");
            break;
        }
    }
}
   
int main()
{
    int sockfd, connfd;
    struct sockaddr_in servaddr, cli;
   
    // socket create and varification
    sockfd = socket(AF_INET, SOCK_STREAM, 0);
    if (sockfd == -1) {
        printf("socket creation failed...\n");
        exit(0);
    }
    else
        printf("Socket successfully created..\n");
    bzero(&servaddr, sizeof(servaddr));
   
    // assign IP, PORT
    servaddr.sin_family = AF_INET;
    servaddr.sin_addr.s_addr = inet_addr("127.0.0.1");
    servaddr.sin_port = htons(PORT);
   
    // connect the client socket to server socket
    if (connect(sockfd, (SA*)&servaddr, sizeof(servaddr)) != 0) {
        printf("connection with the server failed...\n");
        exit(0);
    }
    else
        printf("connected to the server..\n");
	
	
	/* while(1){
		bzero(buffer, MAX_LENGTH);
		fgets(buffer, MAX_LENGTH, stdin);
		buffer[strcspn(buffer, "\n")] = 0;

		// decide for the correct operation from put/get/mget/mput
		char cmd_line[MAX_LENGTH];
		strcpy(cmd_line,buffer);
		char* cmd = strtok(cmd_line," ");
		
		if (strcmp("RET",cmd)==0)
		{
			// send command to server
			func(sockfd);

			// Check for server reponse
			get_file(sockfd, fname);
			
		}
		
		close(sockfd);
		return 0;
	} */
		
   
    // function for chat
    func(sockfd);
   
    // close the socket
    close(sockfd);
}