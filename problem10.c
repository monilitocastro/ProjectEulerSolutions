#include <stdio.h>
#include <stdbool.h>
#define _ARRAYSIZE 250000
int main(){
      int primes[_ARRAYSIZE];
      int i;
      for(i = 0; i < _ARRAYSIZE; i++){
            primes[i] = -1;
      }
      int n=2;
      int index=0;
      while(n< 2000000){
            int j;
            bool isPrime = true;
            
            for(j=0; j<index;j++){
                  //printf("checking %d\n",j);
                  int factor = primes[j];
                  if(n%factor==0){
                        isPrime = false;
                        break;
                  }
            }
            if(isPrime){
            printf("%d\n",n);
                  primes[index++]=n;
            }
            n++;
      }
      
      int j;
      long sum=0;
      for(j=0; j<index;j++){
            sum+=(long)primes[j];
      }
      printf("The sum of primes up to 2 million is %ld.", sum);
     
return 0;
}
