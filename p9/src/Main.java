import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String primeNumbersFound = "";
        for (int i = 1; i <= 1000; i++) {
            if (checkPrime(i)) {
                primeNumbersFound = primeNumbersFound + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to 1000 are:");
        // Print prime numbers from 1 to maxCheck
        System.out.println(primeNumbersFound);
    }
    public static boolean checkPrime(int input){
        boolean flag = false;
        for(int i=1; i<=input ; i++) {
            if(input%i == 0 && i!=1 && i!=input) {
                flag = true;
                break;
            }
        }
        if(flag) {
            return false;
        } else {
                return true;
        }
    }
}
