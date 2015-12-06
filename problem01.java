/*

If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
LEVEL 2
*/
import java.lang.Integer;

public class problem01{
	public static void main(String args[]){
		if(args.length<1){
			System.out.println("Usage: java problem01 1000");
			System.exit(0);
		}
		int x, y;
		x = 1; y = 1;
		int upperBound = Integer.parseInt(args[0])-1;
		int init=upperBound-(upperBound%3);
		int accumulate = 0;
		for(x=init; x > 0; x-=3){
			accumulate += x;
		}
System.out.println("accumulate = "+accumulate);
		init = upperBound-(upperBound%5);
		for(y=init; y > 0; y-=5){
			accumulate += y;
		}
		System.out.println("The sum of all multiples of 3 or 5 below "+ upperBound +" is " + accumulate);
	}

}
