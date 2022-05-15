#include<stdio.h>
int main()
{
	int *p[10],a[10],i,n;
	printf("enter array size\n");
	scanf("%d",&n);
	printf("enter array elements \n");
	for(i=1;i<=n;i++)
	{
		scanf("%d",&a[i]);
	}
	for(i=1;i<=n;i++)
	{
		p[i]=&a[i];
	}
	printf("the array elements are\n");
	for(i=1;i<=n;i++)
	{
		printf("%d",*p[i]);
	}
}
