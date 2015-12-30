// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int solution(int X) {
        // write your code in Java
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int pow = 10;
        while(pow<X){
            int x2 = X / (pow/10);
            int x3 = X % pow;
            int last = x2 % 10;
            x2 *= 10;
            x2 += last;
            x2 *= pow;
            int result = x2 + x3;
            arr.add(new Integer(result) );
            pow*=pow;    
        }
        return Collections.max(arr);
    }
}
