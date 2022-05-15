#include<stdio.h>
main()
{
	
int a[]={5,6,4,3,2};
int  *q;
   q=a;
printf("%p\n",q);
printf("%p\n",a);
q++;
printf("%p\n",&a);
printf("%p\n",&q);
printf("%d\n",a[2]);
printf("%p\n",a+1);
printf("%p\n",q);
printf("%d\n",*(a+2));
printf("%p\n",*(q+2));
printf("%d\n",*(q+1));
printf("%d\n",*a);
}
