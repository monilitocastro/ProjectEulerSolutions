/*

A permutation is an ordered arrangement of objects. For example, 3124 is one possible permutation of the digits 1, 2, 3 and 4. If all of the permutations are listed numerically or alphabetically, we call it lexicographic order. The lexicographic permutations of 0, 1 and 2 are:

012   021   102   120   201   210

What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
*/
import java.util.ArrayList;
import java.util.Iterator;
public class problem24{
      class Seq{
            int[10] arr;
            Seq(){
                  for(int i=0;i<10;i++){
                        arr[i]=i;
                  }
            }
            void copy(Seq s){
                  for(int i=0;i<10;i++){
                        arr[i]=s.arr[i];
                  }
            }
            void shift(int n){
                  if(n==9){
                        return;
                  }
                  int temp = arr[n+1];
                  arr[n+1]=arr[n];
                  arr[n]=temp;
            }
      }
      ArrayList<Seq> q = new ArrayList<Seq>();
      public static void main(String[] args){
            int count = 0;
            for(int i=9; i>0; i--)
                  
            }
      }
      public static void perm(int n){
            if(n==9){
                  return;
            }
            ArrayList<Seq> s = new ArrayList<Seq>();
            
      }
}
