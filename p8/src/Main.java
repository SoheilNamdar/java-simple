
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        long sum = 0;
        for(int i=0 ; i<10 ; i++) {
            long value = generateId();
            System.out.println(value);
            sum += value;
        }
        System.out.println("The average is : " + sum/10);
    }

    public static long generateId() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        return random.nextLong(1L, 100L);
    }

}
