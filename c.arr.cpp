#include<stdio.h>
int main()
{
	int a[20][20][20],i,j,k,n;
	printf("enter number of students");
	scanf("%d",&n);
	printf("enter student marks");
	for(i=1;i<=3;i++)
	{
		for(j=1;j<=n;j++)
		{
			for(k=1;k<=5;k++)
			{
				scanf("%d",&a[i][j][k]);
			}
		}
	}
	printf("student marks are\n");
	for(i=1;i<=3;i++)
	{
		for(j=1;j<=n;j++)
		{
			for(k=1;k<=5;k++)
			{
				printf("%d",a[i][j][k]);
			}
		}
		printf("\n");
	}
}
