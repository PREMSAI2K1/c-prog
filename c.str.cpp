#include<stdio.h>
#include<string.h>
main()
{
	char name[20];
	int count=0,i;
	printf("enter name: ");
	gets(name);
	i=0;
	while(name[i]!='\0')
	{
		count++;
		i++;
	}
	printf("length %d",count);
}
