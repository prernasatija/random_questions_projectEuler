#include <stdio.h>
#include <iostream>


using namespace std;

int main()
{
      long a = 1, b = 2, c, term,sum=0,i;
      term = 4000000;
      for(i=0;i<=term;i++)
      {
                c = a + b;
                if(c > term)
                          break;
                if (c%2==0)
                sum+=c;
                if (c==3) sum+=2;
                a = b;
                b = c;
      }
      printf("The sum of all even digit : %ld",sum);
}
