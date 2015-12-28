import java.util.Stack;
public class problem18{

public static void main(String args[]){
      class StackElement{
            int j;
            int i;
            double total;
            StackElement(int x, int y, double z){
                  j=x;
                  i=y;
                  total=z;
            }
      }
      Stack<StackElement> stack = new Stack<StackElement>();
      double triangle[][]={
      {3.0},
      {7.0, 4.0},
      {2.0, 4.0, 6.0},
      {8.0, 5.0, 9.0, 3.0}};
      //System.out.println("triangle[2][0]="+triangle[2][2]);
/*

{75.0},
{95.0, 64.0},
{17.0, 47.0, 82.0},
{18.0, 35.0, 87.0, 10.0},
 {20.0, 04.0, 82.0, 47.0, 65.0},
{19.0, 01.0, 23.0, 75.0, 03.0, 34.0},
{88.0, 02.0, 77.0, 73.0, 07.0, 63.0, 67.0},
{99.0, 65.0, 04.0, 28.0, 06.0, 16.0, 70.0, 92.0},
{41.0, 41.0, 26.0, 56.0, 83.0, 40.0, 80.0, 70.0, 33.0},
{41.0, 48.0, 72.0, 33.0, 47.0, 32.0, 37.0, 16.0, 94.0, 29.0},
{53.0, 71.0, 44.0, 65.0, 25.0, 43.0, 91.0, 52.0, 97.0, 51.0, 14.0},
{70.0, 11.0, 33.0, 28.0, 77.0, 73.0, 17.0, 78.0, 39.0, 68.0, 17.0, 57.0},
{91.0, 71.0, 52.0, 38.0, 17.0, 14.0, 91.0, 43.0, 58.0, 50.0, 27.0, 29.0, 48.0},
{63.0, 66.0, 04.0, 68.0, 89.0, 53.0, 67.0, 30.0, 73.0, 16.0, 69.0, 87.0, 40.0, 31.0},
{04.0, 62.0, 98.0, 27.0, 23.0, 09.0, 70.0, 98.0, 73.0, 93.0, 38.0, 53.0, 60.0, 04.0, 23.0}};*/

      final int depth = 4;
      Double [][] tri2 = new Double[depth][depth];
      int i;
      for(int j = 0; j < depth; j++){
            tri2[depth-1][j]= triangle[depth-1][j];
      }
      
      for(i = depth-2; i >= 0; i--){
            for(int j = 0; j <= i; j++){
                  tri2[i][j] = new Double(triangle[i][j] + tri2[i+1][j] + tri2[i+1][j+1]);
                  //System.out.println("i="+i+" j="+j+" "+ triangle[i][j] +" "+ tri2[i+1][j] +" "+ tri2[i+1][j+1]);
            }
      }
      for(i = 0; i < depth; i++){
            for(int j = 0; j < depth; j++){
                  System.out.print(tri2[i][j]+ " ");
            }
            System.out.println();
      }
      

      
      
      int j = tri2[1][0]<tri2[1][1]? 1 : 0;
      double total = triangle[0][0];// + triangle[1][j];
      //System.out.println("j="+j);
      
      StackElement dollar = new StackElement(-1, depth, 0.0);
      stack.push(dollar);
      while(!stack.empty() ){
            for(i = 1; i < depth; i++){
                  //System.out.println(tri2[i][j]);
                  double Sl = tri2[i][j];
                  double Sr = tri2[i][j+1];
                  //System.out.println();
                  System.out.println("J="+j);
                  total += triangle[i][j];
                  if(Sl<Sr){
                        j++;
                  }else if(Sl==Sr){
                        System.out.println("Same at i="+ i);
                        stack.push(new StackElement(j+1, i, total) );                        
                  }
                  if(i == depth-1){
                        System.out.println("total="+total);
                        StackElement elem = stack.pop();
                        i = elem.i;
                        j = elem.j;
                        total = elem.total;
                  }
            }
            System.out.println("total="+total);
      }
}
}
