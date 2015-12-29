#include <stdio.h>
#include <stdbool.h>
int main(){
      const int bound = 28123;
      int arr[bound];
      int max = 0;
      int i;
      //int r=12;
      for(i=12; i < bound; i++){
            int sum = 0;
            int j;
            for(j=1; j<i;j++){
                  if(i%j==0){
                        sum+=j;
                  }
            }
            //r++;
            if(sum>i){
                  //printf("abundant %d\n", i);
                  arr[max++]=i;
            }
            //if(r!=i)exit(0);
      }
      long result=0;
      for(i = bound; i > 0; i--){
            int j;
            for(j = 0; j<max; j++){
                  int a = arr[j];
                  int b = i - a;
                  bool bIsAbundant = false;
                  int k;
                  for(k=0; k<max; k++){
                        if(b==arr[k]){
                              bIsAbundant=true;
                        }
                  }
                  if(bIsAbundant==false){
                        result+=(long)i;
                  }
            }
      }
      printf("i=%ld\n",result);
return 0;
}
