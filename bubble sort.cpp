#include<stdio.h>
int main()
{
	int a[10],i,j,n,t;
	printf("enter array size\n");
	scanf("%d",&n);
	printf("enter array elements\n");
	for(i=1;i<=n;i++)
	{
		scanf("%d",&a[i]);
	}
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=n;j++)
		{
			if(a[j]>a[j+1])
			{
				t=a[j];
				a[j]=a[j+1];
				a[j+1]=t;
			}
		}
	}
	printf("the sorted elements are\n");
	for(i=1;i<=n;i++)
	{
		printf("%d",a[i]);
	}
	
}
