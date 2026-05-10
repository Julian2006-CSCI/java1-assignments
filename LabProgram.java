import java.util.Scanner;

public class LabProgram {
   
   public static int fibonacci(int n) {
      if (n < 0) {
         return -1;
      }
      
      if (n == 0) {
         return 0;
      }
      if (n == 1) {
         return 1;
      }
      
      int prev1 = 0;
      int prev2 = 1;
      int current = 0;
      
      for (int i = 2; i <= n; i++) {
         current = prev1 + prev2;
         prev1 = prev2;
         prev2 = current;
      }
      
      return current;
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int startNum;
      
      startNum = scnr.nextInt();
      System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
   }
}