#include<stdio.h>
void add(int a,int b);
main()
{
	int n1,n2;
	printf("enter n1 and n2 values\n");
	scanf("%d %d",&n1,&n2);
	add(n1,n2);
}
void add(int a,int b)
{
	int sum;
	sum=a+b;
	printf("%d",sum);
}
