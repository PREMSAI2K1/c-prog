#include<stdio.h>
#include<conio.h>
int main()
{
	int l,r,i,j,num;
	int count=0;

	scanf("%d",&l);
	scanf("%d",&r);
	for(i=l;i<=r;i++)
	{
		int a[10]={0};
		int num=i;
		while(num)
		{
			if(a[num%10])
			{
				break;
			}
			a[num%10]=1;
			num=num/10;
		}
		if(num==0)
		{
			count++;
		}
		
	}
	if(count>0)
		printf("%d",count);
	else
		printf("No unique number");
}
