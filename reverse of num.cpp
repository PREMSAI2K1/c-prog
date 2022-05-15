#include<stdio.h>
int main()
{
	int n,r,sum=0;
	printf("enter n value\n");
	scanf("%d",&n);
	while(n>0)
	{
		r=n%10;
		sum=sum*10+r;
		n=n/10;
	}
	printf("sum %d",sum);
}
