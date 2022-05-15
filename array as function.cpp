#include<stdio.h>
void display (int a[]);
int main()
{
	int a[10],i,n;
	printf("enter array size\n");
	scanf("%d",&n);
	printf("enter array elements\n");
	for(i=1;i<=5;i++)
	{
		scanf("%d",&a[i]);
	}
	display(a);
}
void display(int a[])
{
	int i,n;
	printf("array elements are\n");
	for(i=1;i<=5;i++)
	{
		printf("%d",a[i]);
	}
}
