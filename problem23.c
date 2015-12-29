#include <stdio.h>
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

return 0;
}
