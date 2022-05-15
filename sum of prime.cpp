#include<stdio.h>
int main()
{
	int i,j,count=0,sum=0;
	for(i=1;i<=9;i++)
	{
		for(j=1;j<=i;j++)
		{
			if(i%j==0)
			{
				count=count+1;
			}
			if(count==2)
			{
				printf("prime number %d",i);
				sum=sum+i;
				{
				
				printf("sum of prime numbers %d",sum);
			}
			}
				
				
		
		
		
		}
	}
}
