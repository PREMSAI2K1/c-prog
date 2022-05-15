#include<stdio.h>
int main()
{
	int a[10],b[10],i,n,alice=0,bob=0;
	printf("enter array size\n");
	scanf("%d",&n);
	printf("enter array elements of a[10]\n");
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	printf("enter array elements of b[10]\n");
	for(i=0;i<n;i++)
	{
		scanf("%d",&b[i]);
	}
	for(i=0;i<n;i++)
	{
		if(a[i]>b[i])
		{
			alice++;
		}
		else if(b[i]>a[i])
		{
			bob++;
		}
		else continue;
	}
	printf("alice points %d",alice);
	printf("bob points %d",bob);
}
