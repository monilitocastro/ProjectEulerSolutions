//The prime factors of 13195 are 5, 7, 13 and 29.
//What is the largest prime factor of the number 600851475143 ?


public class problem03{
  public static void main(String args[]){
    long bigvalue = 600851475143L;
    long pceiling = Math.ceil(Math.sqrt(600851475143L) );
    long size = Math.log(bigvalue)*2L;
    long[] primes = new long[(int)size];
    int rbound = 0;
    for(int i = 0; i < pceiling; i++){
      if(bigvalue%i==0){
        boolean isPrime = true;
        for(int j = 0; j < rbound; j++){
          if(i%primes[j]==0){
            break;
            isPrime = false;
          }
        }
        if(isPrime)primes[rbound++]=i;
      }
    }
  }    
}