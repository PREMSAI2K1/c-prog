#include<stdio.h>
int main()
{
	int i;
	char s[]="how is your exam";
	for(i=0;s[i]!='\0';i++)
	{
		if(i%2==0)
		printf("%c",s[i]);
	}
}

