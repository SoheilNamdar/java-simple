import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            File file = new File("1.txt");
            System.out.println(file.exists());
            FileWriter myWriter = new FileWriter(file);
            for(int i=1 ; i<100 ; i++){
                myWriter.write(i + "\n");
                System.out.println(i);
             }
            myWriter.close();

            /*Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();

                System.out.println(data);
            }
            myReader.close();*/
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
