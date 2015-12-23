/*
2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 2^1000?
*/


import java.math.BigInteger;
public class problem16{

      
      public static void main(String args[]){
            BigInteger big = new BigInteger("2");
            big=big.pow(1000);
            String number = big.toString();
            //System.out.println(big);
            int result = 0;
            for(int i = 0; i < number.length(); i++){
                  result += Character.getNumericValue(number.charAt(i) );
            }
            System.out.println(result);
      }
}
