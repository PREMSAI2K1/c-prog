#include<stdio.h>
main()
{
	int a[10][10];
	int i,j,n,k;
	printf("enter no of rows");
	scanf("%d",&n);
	printf("enter no of coloumns");
	scanf("%d",&k);
	for(i=0;i<n;i++)
	{
		for(j=0;j<k;j++)
		{
			printf("enter array elements a[%d][%d]",i,j);
			scanf("%d",&a[i][j]);
		}
		
	}
	for(i=0;i<n;i++)
	{
		if(i%2==0)
		{
			for(j=0;j<k;j++)
			{
				printf("%d",a[i][j]);
			}
			
		}
		else
		{
			for(j=k-1;j>=0;j--
			25)
			{
				printf("%d",a[i][j]);
			}
		}
	}
}
