#include<stdio.h>
#include<strings.h>
main()
{
	char s1[20],s2[20];
	int l1,l2,i;
	printf("enter string 1:");
	gets(s1);
	printf("enter string 2:");
	gets(s2);
	l1=strlen(s1);
	l2=strlen(s2);
	for(i=0;i<=l2;i++)
	{
		s1[l1+i]=s2[i];
	}
	printf("merge string %s",s1);
}
