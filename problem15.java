public class problem15{

      
      public static void main(String args[]){
            long result = 1L;
            for(int i = 1; i<=20; i++){
                  result += (long)Math.pow(2, i);
            }
            System.out.println(result);
      }
}
