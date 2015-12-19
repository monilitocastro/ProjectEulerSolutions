/*A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit number
*/
import java.lang.Math;

public class problem04{
	public static void main(String args[]){
		//lowest bound on palindrome candidate 10,000 to 998,001
		final int hBound = 999 * 999;
		final int lBound = 100 * 100;
		//the candidate palindrome must be between lBound and hBound
		for(int i = hBound; i >= lBound; i--){
		      if( isPalindrome(i) ){
		            System.out.println("The number "+i+" is a palindrome");
		            int factor = isCompliant(i);
		            if( factor!=-1 ){
		                  System.out.println("Factors are " + factor + " and "+ (i/factor) );
		                  System.exit(0);
		            }
		      }
		}
	}
	public static int isCompliant(int number){
	      int factor = 1;
	      int i;
	      int repeat = -1;
	      while(true){
	            int uBound = (int)Math.sqrt(number);
	            if(repeat==uBound){
	                  return -1;
	            }
	            for(i = 2; i <= uBound; i++){
	                  if(number % i == 0){
	                        number /= i;
	                        factor *= i;
	                        break;
	                  }
	            }
	            //System.out.println("factor="+factor+" number="+number+ " i="+i);
	            if(factor > number){
	                  factor /= i;
	                  number *= i;
	                  if(number < 1000)return factor;
	            }
	            //if(factor > number) return -1;

	            repeat = uBound;
	      }
	}
	
	public static int digitAt(int source, int index){
		int truncate = (int)Math.pow(10.0, index);
		int ceiling = (int)Math.pow(10.0, index+1);
		//System.out.println((source % ceiling) / truncate);
		int result = ((int)((source % ceiling) / truncate));
		return result;
	}
	public static boolean isPalindrome(int b){
	      int i;
	      for(i = 0; i < 9; i++){
	            int tenPow = (int)Math.pow(10, i);
	            if(tenPow > b){
	                  break;
	            }
	      }
	      int middle = i / 2;
	      int j;
	      boolean flag = true;
	      for(j = 0; j < middle; j++){
	            int l = digitAt(b, j);
	            int r = digitAt(b, i - j - 1 );
	            if(l!=r){
	                  flag = false;
	                  break;
	            }
	      }
	      
		return flag;
	}
}
