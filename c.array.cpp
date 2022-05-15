#include<stdio.h>
main()
{
	int a[20],n,i,num=9,pos=3;
	printf("enter array size:");
	scanf("%d",&n);
	printf("enter array elements:");
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	for(i=n-1;i>=pos-1;i--)
	{
		a[i+1]=a[i];
	}
	a[pos-1]=num;
	n++;
	printf("the array elements are:");
	for(i=0;i<n;i++)
	{
		printf("%d\n",a[i]);
	}
	
}
