#include<stdio.h>
int main()
{
	int n,r,c,temp,sum=0,limit;
	printf("enter limit");
	scanf("%d",&limit);
	temp=n;
	for(n=1;n<=limit;n++)
	{
		sum=0;
		while(n>0)
		{
			r=n%10;
			c=r*r*r;
			sum=sum+c;
			n=n/10;
		}
		n=temp;
		if(n==sum)
		{
			printf("armstrong %d\n",n);
		}
		else
		{
			printf("not an armstrong %d\n",n);
		}
	}
