/*

Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.

For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

Evaluate the sum of all the amicable numbers under 10000.
*/
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
public class problem21{
      
      public static void main(String args[]){
            int result = 0;
            Set<Set<Integer>> set = new HashSet<Set<Integer>>();
            for(int i = 2; i < 10000; i++){
                  int div = 0;
                  for(int j = 1; j <= i; j++){
                        if(i%j==0){
                              div+=j;
                              
                              //System.exit(0);
                        }
                        System.out.println("i="+i + " j="+j);
                  }
                  int div2 = 0;
                  if(div!=0){
                  System.out.println("Divisor! i="+i + " div="+div);
                        for(int j = 1; j <= div; j++){
                              if(i%j==0){
                                    div2+=j;
                              }
                        }
                        if(div2==i){
                              System.out.println("Amicable numbers "+i + " and " +div2);
                              Set<Integer> temp = new HashSet<Integer>();
                              temp.add(new Integer(i));
                              temp.add(new Integer(div2));
                              set.add(temp );
                        }
                  }
            }
            Iterator<Set<Integer>> itSI= set.iterator();
            while(itSI.hasNext() ){
                  Set<Integer> elem = itSI.next();
                  Iterator<Integer> iI = elem.iterator();
                  while(iI.hasNext() ){
                        result += iI.next();
                  }
            }
            System.out.println(result);
      }
}
