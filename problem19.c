#include <stdio.h>
int main(){
      int year = 1900;
      int maxdays= 31;
      int wkd = 0;
      int count = 0;
      int y;
      for(y = year; y < 2001; y++){
            int m;
            for(m=1; m<=12; m++){
                  if(m==9|m==4|m==6|m==11){
                        maxdays=30;
                  }else if(m!=2){
                        maxdays=31;
                  }else if(m==2 & y%4==0 & (y%100!=0| (y%100==0 & y%400==0) ) ){
                        maxdays=29;
                  }
                  int d;
                  for(d=1; d<=maxdays; d++){
                        wkd++;
                        wkd%=7;
                        if(1901 <= y && y < 2001 && wkd==0 && d==1){
                              count++;
                        }
                  }
            }
      }
      printf("%d\n",count);
return 0;
}
