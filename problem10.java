/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
*/
import java.util.ArrayList;
import java.util.Iterator;
public class problem10{
      public static void main(String args[]){
            int count = 0;
            int number = 2;
            long result = 0;
            int lastPrime = -1;
            ArrayList<Integer> primeList = new ArrayList<Integer>();
            while(number < 2_000_000){
                  Iterator<Integer> itI = primeList.iterator();
                  boolean isPrime = true;
                  while(itI.hasNext() ){
                        int prime = itI.next();
                        if(number%prime==0){
                              isPrime =false;
                        }
                  }
                  if(count%200==0){
                        System.out.println(number+":"+lastPrime);
                  }
                  if(isPrime){
                        lastPrime = number;
                        primeList.add(number);
                        count++;
                        result += number;
                  }
                  number++;
            }
            System.out.println(result);
      }
}
