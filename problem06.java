/**
The sum of the squares of the first ten natural numbers is,
1**2 + 2**2 + ... + 10**2 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)**2 = 552 = 3025

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/
public class problem06{
      public static void main(String args[]){
            if(args.length!=1){
                  System.out.println("Usage: java problem06 N");
                  System.exit(0);
            }
            long sum1=0;
            long sum2=0;
            long uBound = Long.parseLong(args[0]);
            for(long i = 0; i <= uBound; i++){
                  sum1 += i*i;
                  sum2 += i;
            }
            sum2 *= sum2;
            
            System.out.println("answer is "+ (sum2 - sum1) );
      }
}
