/*
If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?

NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.
*/
import java.util.Stack;
import java.lang.Math;
public class problem17c{
      public static void main(String args[]){
            for(int i = 1; i <= 1000; i++){
            
            }
      }
      public static int rate(int n, int pow){
            switch(pow){
                  case 1:
                        length = 
            }
      }
      public static Stack<Integer> stack(int n){
            int places;
            for(places = 0; places < 18; places++){
                  int tens = (int)Math.pow(10, places);
                  if(tens <= n && n < tens*10){
                        break;
                  }
            }
            Stack<Integer> stack = new Stack<Integer>();
            int index = 0;
            int compl = places;
            int rem = places % 3;
            for(int i = 0; i < 18; i+=3){
                  if(places <0) break;
                  int mod = n % 1000;
                  //stack.push(new Integer(compl-places) );
                  stack.push(new Integer(mod) );
                  places-=3;
                  rem = 3;
                  n /= 1000;                  
            }
            //System.out.println(stack.toString() + stack.size() );
            return stack;
      }
}
