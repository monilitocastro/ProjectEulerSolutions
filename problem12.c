#include <stdio.h>
#include <stdbool.h>
int main(){
      int n = 1;
      int triangle = n;
      while(true){
            int count = 0;
            int i;
            for(i = triangle; i > 1; i--){
                  if(triangle%i==0){
                        count++;
                  }
            }
            if(count>500){
                  printf("%d\n",triangle);
                  return 0;
            }
            if((n%400==0) && count > 50)printf("triangle=%d  count=%d\n",triangle,count);
            n++;
            triangle += n;
      }
      
return 0;
}
