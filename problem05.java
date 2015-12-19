import java.util.Hashtable;
import java.util.Iterator;
public class problem05{
      public static void main(String args[]){
            Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();
            int number = -1;
            if(args.length == 0){
                  System.out.println("Usage: java problem05 N where N is an integer");
                  System.exit(0);
            }else{
                  number = Integer.parseInt(args[0]);
            }
            int uBound = (int)Math.sqrt(number);
            for(int i = 2; i <= uBound; i++){
                  int counter = 0;
                  while(number%i==0){
                        number /= i;
                        counter++;
                  }
                  if(counter!=0){
                       Integer I = new Integer(i);
                       uBound = (int)Math.sqrt(number);
                       if(table.containsKey(I) ){
                             Integer tableValue = table.get(I);
                             if(tableValue < counter ){
                                    tableValue = counter;
                             }
                       }else {
                              table.put(I, new Integer(counter) );
                       }
                  }
            }
            
            Iterator<Integer> keys = table.keySet().iterator();
            int result = 1;
            while(keys.hasNext() ){
                  int factor = keys.next();
                  int pow = table.get(factor);
                  result *= (int)Math.pow(factor, pow);
            }
            System.out.println("The smallest multiple is " + result);
      }
}
