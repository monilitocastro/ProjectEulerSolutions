/*

If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?

NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.
*/

public class problem17d{
      public static void main(String args[]){
            int total = 0;
            for(int i = 1; i <=1000; i++){
                  int n = i;
                  int count = 0;
                  while(n!=0){
                  
                        int rem = -1;
                        //int trem = -1;
                        if(n==1000){
                              count += 11;
                              n -= 1000;
                        }else if(100 <= n && n < 1000){
                              int hundred = n % 1000;
                              hundred /= 100;
                              rem = n - (hundred*100);
                              n = hundred;
                              count += 7;//hundred
                              count += 3; //and
                        }
                        if(n==1){
                              count += 3;
                              n-=1;
                        }else if(n==2){
                              count += 3;
                              n-=2;
                        }else if(n==3){
                              count += 5;
                              n-=3;
                        }else if(n==4){
                              count += 4;
                              n-=4;
                        }else if(n==5){
                              count += 4;
                              n-=5;
                        }else if(n==6){
                              count += 3;
                              n-=6;
                        }else if(n==7){
                              count += 5;
                              n-=7;
                        }else if(n==8){
                              count += 5;
                              n-=8;
                        }else if(n==9){
                              count += 4;
                              n-=9;
                        }else if(n==10){
                              count += 3;
                              n-=10;
                        }else if(n==11){
                              count += 6;
                              n-=11;
                        }else if(n==12){
                              count += 6;
                              n-=12;
                        }else if(n==13){
                              count += 8;
                              n-=13;
                        }else if(n==14){
                              count += 8;
                              n-=14;
                        }else if(n==15){//fifteen
                              count += 7;
                              n-=15;
                        }else if(n==16){
                              count += 7;
                              n-=16;
                        }else if(n==17){
                              count += 9;
                              n-=17;
                        }else if(n==18){
                              count += 8;
                              n-=18;
                        }else if(n==19){
                              count += 8;
                              n-=19;
                        }else if(20<=n && n<30){ //twenty
                              count += 6;
                              //System.out.println("**");
                              n-=20;
                        }else if(30<=n && n<40){//thirty
                              count += 6;
                              n-=30;
                        }else if(40<=n && n<50){ //forty
                              count += 5;
                              n-=40;
                        }else if(50<=n && n<60){//fifty
                              count += 5;
                              n-=50;
                        }else if(60<=n && n<70){//sixty
                              count += 5;
                              n-=60;
                        }else if(70<=n && n<80){//seventy
                              count += 7;
                              n-=70;
                        }else if(80<=n && n<90){//eighty
                              count += 6;
                              n-=80;
                        }else if(90<=n && n<100){//ninety
                              count += 6;
                              n-=90;
                        }
                        //System.out.println("n="+n);
//115 one hundred fifteen
                        //System.out.println("n="+n);
                        if(rem !=-1){
                              n=rem;
                        }
                  }
                  System.out.println("i="+i + " count="+count);
                  total += count;
                  
            }
            total = total - (9 * 3);
            System.out.println(total);
      }
}
