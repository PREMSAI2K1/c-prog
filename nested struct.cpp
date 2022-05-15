#include<stdio.h>
struct student
{
	int rollno;
	char name[20];
	struct dob
	{
		int date;
		char month[20];
		int year;
	}d;
}s;
int main()
{
	printf("enter student rollno and name\n");
	scanf("%d %s",&s.rollno,s.name);
	printf("enter dob\n");
	scanf("%d %s %d",&s.d.date,s.d.month,&s.d.year);
	printf("student details are\n");
	printf("%d %s %d %s %d",s.rollno,s.name,s.d.date,s.d.month,s.d.year);
}
