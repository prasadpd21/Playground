#include<stdio.h>
int main()
{
  int a, b, c, sum, num;
  scanf("%d", &a);
  sum = a / 10;
  num = a % 10;
  c = sum + num;
  printf("%d", c);
  return 0;
}