/*
 * 
Each new term in the Fibonacci sequence is generated by adding the previous two terms.
By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million,
find the sum of the even-valued terms.
*/

//Level 1

public class problem02level1{
  public static void main(String args[]){
    int result = 0;
    int a, b, accumulator;
    a=0;
    b=1;
    accumulator=0;
    while(result < 4_000_000){
      result = a + b;
      a = b;
      b = result;
      if(result%2==0){
        accumulator += result;
      }
      System.out.print(" " +result);
    }
    System.out.println("The accumulator is " + accumulator);
  }
}