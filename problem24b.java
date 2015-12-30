public class problem24b{
      public static void main(String args[]){
            int grid[][] = new int[1_000_000][10];
            int max = 0;
            for(int i = 0; i < 10; i++){
                  grid[0][i]=i;
            }
            int oldmax = max;
            max = 1;
            for(int i = 10-1; i >= 0; i--){
                  for(int j = i; j < 10; j++){
                        oldmax=max;
                        for(int e = 0; e < oldmax; e++){
                              int new_stripe[] = new int[10];
                              for(int stripeInd = 0; stripeInd < 10; stripeInd++){
                                    new_stripe[stripeInd]=grid[e][stripeInd];
                              }
                              int travIndex = j;
                              while(travIndex<10-1){
                                    int temp = new_stripe[travIndex];
                                    new_stripe[travIndex]=new_stripe[++travIndex];
                                    for(int cloneInd = 0; cloneInd <10; cloneInd++){
                                          grid[max][cloneInd]=new_stripe[cloneInd];
                                    }
                                    max++;
                                    if(max>1_000_000-1){
                                          for(int y=0; y < 10; y++){
                                                System.out.print(" "+grid[999_999][y]);
                                          }
                                          System.out.println();
                                          System.exit(0);
                                    }
                              }
                        }
                        //oldmax=max;
                  }
            }
      }
}
