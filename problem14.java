public class problem14{
      public static void main(String args[]){
            long count = 0L;
            long biggest = -1L;
            long start = -1L;
            long i;
            long result = -1L;
            for(i=2; i< 1000000L;i++){
                  count = 0;
                  result = i;
                  while(result!=1L){
                  //if(i%32==0)printf("i=%d start=%d  count=%d biggest=%d\n ",i,start,count,biggest);
                        if(result!=-1){
                        boolean out = true;
                              if(result%2==0){
                                    result /= 2;
                                    out=false;
                              }else{
                                    result = 3*result+1;
                                    out=false;
                              }
                              count++;
                              if(out==true){
                                    System.out.println("Out");
                                    System.exit(0);
                              }
                        }else{
                              System.out.println("Error");
                              System.exit(0);
                        }
                  }
                  if(count>biggest){
                        biggest = count;
                        start = i;
                  }
                  if(i%32L==0L)System.out.println("i="+i+" start="+start+"  count="+count+" biggest="+biggest);
            }
            System.out.println("start="+start+"  count="+count);
      }
}
