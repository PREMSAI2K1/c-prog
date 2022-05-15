#include<stdio.h>
struct student
{
	int rollno;
	char name[20];
	int smarks[10];
}s;
int main()
{
	int i;
	printf("enter student rollno and name\n");
	scanf("%d %s",&s.rollno,s.name);
	printf("enter student marks\n");
	for(i=1;i<=5;i++)
	{
		scanf("%d",&s.smarks[i]);
	}
	printf("enter student details\n");
	printf("%d %s",s.rollno,s.name);
	printf("student marks\n");
	for(i=1;i<=5;i++)
	{
		printf("%d",s.smarks[i]);
	}
	printf("\n");
}
