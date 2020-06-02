import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        boolean flag = false;
        for(int i=1; i<=input ; i++) {
            if(input%i == 0 && i!=1 && i!=input) {
                flag = true;
                break;
            }
        }

        if(flag) {
            System.out.println("Non");
        } else
            System.out.println("Yes");
    }
}
