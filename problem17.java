/*
If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?

NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.
*/
import java.lang.StringBuilder;
public class problem17{
      public static void main(String args[]){
            int n = 0
            for(int i = 0; i<= 1000; i++){
                  n++;
                  int decr = n;
                  while(decr>0){
                        int msig = -1;
                        int tenpower = -1;
                        StringBuilder build = new StringBuilder();
                        if(1000 <= decr && decr < 10000){
                              msig = decr / 1000;
                              tenpower = 3;
                        }else if(100 <= decr && decr < 1000){
                              msig = (decr%1000) /100;
                              tenpower = 2;
                        }else if(10 <= decr && decr < 100){
                              msig = (decr%100)/10;
                              tenpower = 1;
                        }else if(1 <= decr && decr < 10){
                              msig = (decr%10);
                              tenpower = 0;
                        }
                        switch(tenpower){
                              case 3:
                                    build.append("thousand");
                                    break;
                              case 2:
                                    build.append("hundred");
                                    break;
                              case 1:
                                    switch(decr){
                                          case 19:
                                                build.append("nineteen");
                                                break;
                                          case 18:
                                                build.append("eighteen");
                                                break;
                                          case 17:
                                                build.append("seventeen");
                                                break;
                                          case 16:
                                                build.append("sixteen");
                                                break;
                                          case 15:
                                                build.append("fifteen");
                                                break;
                                          case 14:
                                                build.append("fourteen");
                                                break;
                                          case 13:
                                                build.append("thirteen");
                                                break;
                                          case 12:
                                                build.append("twelve");
                                                break;
                                          case 11:
                                                build.append("eleven");
                                                break;
                                          case 10:
                                                build.append("ten");
                                                break;
                                    }
                                    break;
                        }
                  }
            }
      }
}
