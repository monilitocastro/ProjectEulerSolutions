/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
*/
import java.util.ArrayList;
import java.util.Iterator;
public class problem07{
      public static void main(String args[]){
            if(args.length!=1){
                  System.out.println("Usage: java problem07 N");
                  System.exit(0);
            }
            int loopInvariant = Integer.parseInt(args[0]);
            ArrayList<Integer> primes = new ArrayList<Integer>();
            int index = 1;
            int number = 3;
            primes.add(2);
            
            while(index <= loopInvariant){
                  Integer uBound = new Integer((int)Math.sqrt(number) );
                  Iterator<Integer> itI = primes.iterator();
                  boolean isPrime = true;
                  while(itI.hasNext() ){
                        Integer prime = itI.next();
                        if(number%prime==0){
                              isPrime = false;
                              break;
                        }
                  }
                  if(isPrime){
                        primes.add(new Integer(number));
                        index++;
                  }
                  
                  number++;
            }
            System.out.println("Prime at index "+args[0]+" is "+ primes.get(loopInvariant - 1 ) );
      }
}
