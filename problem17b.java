/*

If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?

NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.
*/
public class problem17b{
      public static void main(String args[]){
            int reduce = 0;
            int length = 0;
            int boomerang = -1;
            int msig = -1;
            for(int i = 0; i <= 1000; i++){
                  reduce = i;
                  //tenpower = -9999999;
                  if(reduce==1){
                        length+=3; //one
                        reduce-=1;
                        msig=1;
                  }else if(reduce==2 ){
                        length+=3;
                        reduce-=2;
                        msig=2;
                  }else if(reduce==3 ){
                        length+=5;
                        reduce-=3;
                        msig=3;
                  }else if(reduce==4 ){
                        length+=4;
                        reduce-=4;
                        msig=4;
                  }else if(reduce==5 ){
                        length+=4;
                        reduce-=5;
                        msig=5;
                  }else if(reduce==6 ){
                        length+=3;
                        reduce-=6;
                        msig=6;
                  }else if(reduce==7 ){
                        length+=5;
                        reduce-=7;
                        msig=7;
                  }else if(reduce==8 ){
                        length+=5;
                        reduce-=8;
                        msig=8;
                  }else if(reduce==9 ){
                        length+=4;
                        reduce-=9;
                        msig=9;
                  }else if(reduce==10 ){
                        length+=3;
                        reduce-=10;
                  }else if(reduce==11 ){
                        length+=6;
                        reduce-=11;
                  }else if(reduce==12 ){
                        length+=6;
                        reduce-=12;
                  }else if(reduce==13 ){
                        length+=8;
                        reduce-=13;
                  }else if(reduce==14 ){
                        length+=8;
                        reduce-=14;
                  }else if(reduce==15 ){
                        length+=7;
                        reduce-=15;
                  }else if(reduce==16 ){
                        length+=7;
                        reduce-=16;
                  }else if(reduce==17 ){
                        length+=9;
                        reduce-=17;
                  }else if(reduce==18 ){
                        length+=8;
                        reduce-=18;
                  }else if(reduce==19 ){
                        length+=8;
                        reduce-=19;
                  }else if(reduce==19 ){
                        length+=8;
                        reduce-=19;
                  }else if(20 <= reduce && reduce < 30 ){
                        length+=6;
                        reduce-=20;
                  }else if(30<= reduce && reduce <  40){
                        length+=6;
                        reduce-=30;
                  }else if(40<= reduce && reduce <  50){
                        length+=5;
                        reduce-=40;
                  }else if(50 <= reduce && reduce < 60){
                        length+=5;
                        reduce-=50;
                  }else if(60<= reduce && reduce <  70){
                        length+=5;
                        reduce-=60;
                  }else if(70<= reduce && reduce <  80){
                        length+=7;
                        reduce-=70;
                  }else if(80<= reduce && reduce < 90){
                        length+=6;
                        reduce-=80;
                  }else if(90<= reduce && reduce < 100){
                        length+=6;
                        reduce-=90;
                  }
            }
            public static int comma(){
                  int result = 0;
            }
      }
}
