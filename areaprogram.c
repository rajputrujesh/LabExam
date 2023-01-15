#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>
int main()
{
    int length, breadth, area;
    int pid;

    printf("Enter the length of the rectangle: ");
    scanf("%d", &length);
    printf("Enter the breadth of the rectangle: ");
    scanf("%d", &breadth);

    pid = fork();
    if (pid == 0) {
        // Child process
        area = length * breadth;
        printf("Area of rectangle: %d\n", area);
    } else {
        // Parent process
        wait(NULL); // wait for the child process to finish
        printf("Child process completed.\n");
    }

    return 0;
}

