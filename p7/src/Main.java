import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = 5;
        int result = recursiveFactorial(number);
        System.out.println(result);
    }

   /* public static int directiveFactorial(int number) {
        int result = 1;
        for (int i=5; i>=1 ; i--) {
            result *= i;
        }
        return result;
    }*/

   public static int recursiveFactorial(int number) {
       if(number == 0)
           return 1;
       else
        return number * recursiveFactorial(number-1);
   }
}
