#include<stdio.h>
main()
{
	int i,n,sum=0;
	printf("enter n value");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		sum=sum+i;
	}
	printf("sum of n numbers is: %d",sum);
}
