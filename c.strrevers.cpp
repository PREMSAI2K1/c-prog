#include<stdio.h>
#include<strings.h>
main()
{
	char name[20];
	int i,j,temp;
	printf("enter name");
	gets(name);
	i=0;
	j=(strlen(name)-1);
	while(i<j)
	{
		temp=name[i];
		name[i]=name[j];
		name[j]=temp;
		i++;
		j--;
	}
	printf("string %s",name);
}
