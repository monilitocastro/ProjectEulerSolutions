#include <stdio.h>
int main(){
        const int size = 21;
        long grid[size][size];
        int i,j;
        for(i=0;i<size;i++){
                for(j=0;j<size;j++){
                        if((j==0) | (i==0) ){
                                grid[i][j]=1L;
                        }else{
                                grid[i][j]=0L;
                        }
                }
        }
        //grid[0][0]=0;
        for(i=0;i<size;i++){
                for(j=0;j<=i;j++){
                        int compl = i-j;
                        //printf("%d,%d\n",compl,j);
                        if((compl>0)&&(j>0) ){
                                grid[compl][j] = grid[compl-1][j] + grid[compl][j-1];
                        }
                }
        }
        //printf("******************\n");
        /**for(i=size-1;i>0;i--){
                for(j=18;j>=0;j--){
                        int compl = 17 -j;
                        //printf("%d,%d\n",(20-j),(20-compl) );
                        grid[20-j][20-compl] = grid[19-j][20-compl] + grid[20-j][19-compl];
                }
        }*/
        for(i=size-1;i>=0;i--){
            int compl = (size-1)-i;
            grid[size-1][compl] = grid[i][compl];
        }
        
        for(i=size-2;i>=0;i--){
            for(j=0; j<i; j++){
                  grid[i][j]=grid[i+1][j]+grid[i+1][j+1];
            }
        }
        
        for(i=0;i<size;i++){
                for(j=0;j<size;j++){
                        printf("%ld\t",grid[i][j]);
                }
                printf("\n");
        }       
        
        printf("result is %ld\n",grid[size-1][size-1]);
return 0;
}

