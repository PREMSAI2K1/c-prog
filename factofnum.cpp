#include<stdio.h>
int factofnum(int n);
main()
{
	int n,res;
	printf("enter n value\n");
	scanf("%d",&n);
	res=factofnum(n);
	printf("result %d\n",res);
	
}
int factofnum(int n)
{
	if(n==1)
	return 1;
	else
	return n*factofnum(n-1);
}
