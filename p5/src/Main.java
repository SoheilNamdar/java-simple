import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int sum = 0;
        for(int i=1; i<=input ; i++) {
            if(input%i == 0 && i%2 == 1) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
