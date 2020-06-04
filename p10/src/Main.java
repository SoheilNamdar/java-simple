import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int number = 3;
        int result = fibonacci(number);
        System.out.println(result);
    }

    public static int fibonacci(int number) {
        while(number>1)
            return fibonacci(number - 1) * fibonacci(number - 2);
        else
            return 1;
    }
}
