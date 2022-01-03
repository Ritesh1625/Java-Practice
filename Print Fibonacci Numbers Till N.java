import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      // write your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      if(n==1){
          System.out.println(0);
      }
      else if(n > 1){
          int a = 0;
          int b = 1;
          
          System.out.println(a);
          System.out.println(b);
          
          for(int i=2; i<n; i++){
              int c = a + b;
              System.out.println(c);
              a = b;
              b = c;
          }
      } 
   }
  }
