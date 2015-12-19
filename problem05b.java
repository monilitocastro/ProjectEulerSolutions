/**
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/
import java.util.Hashtable;
import java.util.Iterator;
public class problem05b{
      public static void main(String args[]){
            Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();
            if(args.length!=2){
                  System.out.println("Usage: java program05b 1 20");
                  System.exit(0);
            }
            int firstInt = Integer.parseInt(args[0]);
            int secondInt = Integer.parseInt(args[1]);
            for(int i = firstInt; i <= secondInt; i++){
                  int candidate = i;
                  System.out.println("*"+candidate);
                  for(int j = 1; j <= i; j++){
                        int counter = 0;
                        while(candidate%j==0){
                              candidate /= j;
                              counter++;
                              System.out.println("candidate="+candidate+ " counter="+counter);
                              if(candidate==1)break;
                        }
                        System.out.println("i="+i + " j="+j + " counter=" +counter);
                        Integer I = new Integer(i);
                        if(counter!=0){
                              if(table.containsKey(I) ){
                                    Integer tableValue = table.get(I);
                                    tableValue = counter;
                              }else{
                                    table.put(I, new Integer(counter) );
                              }
                        }
                  }
            }
            int result = 1;
            Iterator<Integer> keys = table.keySet().iterator();
            while(keys.hasNext() ){
                  Integer key = keys.next();
                  result *= (int)Math.pow(key, table.get(key) ) ;
            }
            
            System.out.println("The smallest positive number divisible all number from "+args[0]+" to " +args[1] + " is " +result);
      }
}
