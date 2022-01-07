all: shell.o
	gcc -o all shell.o
shell.o: shell.c
	gcc -c shell.c
clean: 
	rm all shell.o

