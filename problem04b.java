/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/

public class problem04b{
      public static void main(String args[] ){
            int left, right;
            
            for(left = 997; left >= 100; left--){
                  right = 0;
                  right += ((left%10) * 100 );
                  right += ((left%100)/10 ) * 10;
                  right += left/100;
                  int palindrome = left * 1000 + right;
                  int factor=1;
                  //System.out.println(palindrome);                  
                  int uBound = (int)Math.sqrt(palindrome);
                  for(int i = 2; i <= uBound; i++){
                        uBound = (int)Math.sqrt(palindrome);
                        if(palindrome%i==0){
                              palindrome /= i;
                              factor *= i;
                        }
                        if(99 < factor && factor < 1000 && 99 < palindrome && palindrome < 1000){
                              System.out.println("Palindrome found: "+ (factor*palindrome)+ "="+factor+"*"+palindrome );
                              System.exit(0);
                        }
                  }
            }
      }
}
