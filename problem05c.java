/**
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/
import java.lang.Math;
import java.util.Hashtable;
import java.util.Iterator;
public class problem05c{
      public static void main(String args[]){
            if(args.length!=2){
                  System.out.println("Usage: java problem05c N M");
                  System.exit(0);
            }
            int lBound = Integer.parseInt(args[0]);
            int rBound = Integer.parseInt(args[1]);
            //System.out.println(primeFactors(number).toString() );
            Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();
            for(int i = lBound; i <= rBound; i++){
                  table.put(new Integer(i), new Integer(0) );
            }
            for(int i = lBound; i <= rBound; i++){
                  Hashtable<Integer, Integer> factors = primeFactors(i);
                  Iterator<Integer> itF = factors.keySet().iterator();
                  while(itF.hasNext() ){
                        Integer key = itF.next();
                        Integer newValue = factors.get(key);
                        Integer oldValue = table.get(key);
                        if(newValue > oldValue){
                              table.put(key, newValue);
                        }
                  }
            }
            Iterator<Integer> itF = table.keySet().iterator();
            Integer result = new Integer(1);
            while(itF.hasNext() ){
                  Integer factor = itF.next();
                  result *= (int)Math.pow(factor, table.get(factor) );
            }
            System.out.println(table.toString());
            System.out.println("The number is "+result);
      }
      
      private static Hashtable<Integer, Integer> primeFactors(int number){
            int hCheck = (int)Math.sqrt(number);
            Hashtable<Integer, Integer> table= new Hashtable<Integer, Integer>();
            int prevValue = -1;
            for(int i=2; i<=number; i++){
                  Integer I;
                  while(prevValue!=number && number%i==0 ){
                        I = new Integer(i);
                        if(table.containsKey(I) ){
                              Integer tableValue = table.get(I);
                              Integer newInt = new Integer(tableValue + 1);
                              table.put(I, newInt);
                              //System.out.println("tableValue="+tableValue);
                        }else{
                              table.put(I, new Integer(1) );
                        }
                        //System.out.println("prevValue="+prevValue+ " i="+i);
                        prevValue = number;
                        number /= i;
                  }
                  
                  if(prevValue==number){
                        I = new Integer(number);
                        table.put(I, new Integer(1) );
                  }
            }
            return table;
      }
}
