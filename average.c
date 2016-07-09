#include<stdio.h>
#include<conio.h>
void main()
{
     int a[10],n,i,s=0;
     float av;
     printf("Enter the size of the array \n");
     scanf("%d",&n);
 printf("Enter the elements of the array to find their average \n");
     for(i=0;i<n;i++)
     {
           scanf("%d",&a[i]);
           s=s+a[i];
     }
 av=(float)s/n;
     printf(" Average is %f",av);
  getch();
}
