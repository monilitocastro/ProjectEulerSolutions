import java.math.BigInteger;
public class problem20{
      public static void main(String [] args){
            BigInteger big = new BigInteger("1");
            for(int i = 100; i > 0; i--){
                  big = big.multiply( new BigInteger(String.valueOf(i) ) );
            }
            String str = big.toString();
            int result = 0;
            for(int j=0; j< str.length() ;j++){
                  int digit = Character.getNumericValue(str.charAt(j) );
                  result += digit;
            }
            System.out.println(result);
      }
}
