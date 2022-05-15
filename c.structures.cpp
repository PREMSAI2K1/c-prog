#include<stdio.h>
struct employee
{
	int empid;
	char empname[20];
} e1,e2;
int main()
{
	printf("enter 1st employee details\n");
	scanf("%d,%s",&e1.empid,e1.empname);
	printf("enter 2nd emplyee details");
	scanf("%d,%s",&e2.empid,e2.empname);
	printf("1st employee details are %d ,%s",e1.empid,e1.empname);
	printf("2nd employee deetails are %d ,%s",e2.empid,e2.empname);
}
