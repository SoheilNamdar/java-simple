import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int number = 31;
        for(int i=1 ; i<=number ; i++){
           directiveFibonacci(i);
        }
    }

    public static void directiveFibonacci(int number){
        int n1 = 1, n2 = 1, n3;
        for(int i=1 ; i<=number ; i++){
            n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
    }

    /*public static int recursiveFibonacci(int number) {
        if (number == 0 || number == 1)
            return 1;
        else {
                return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }*/
}
