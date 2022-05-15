#include<stdio.h>
struct student
{
	int rollno;
	char name[20];
	float perc;
}s[10];
int main()
{
	int i;
	printf("enter student details\n");
	for(i=1;i<=10;i++)
	{
		scanf("%d %s %f",&s[i].rollno,s[i].name,&s[i].perc);
	}
	printf("student details are\n");
	for(i=1;i<=10;i++)
	{
		printf("%d %s %f",s[i].rollno,s[i].name,s[i].perc);
	}
}
