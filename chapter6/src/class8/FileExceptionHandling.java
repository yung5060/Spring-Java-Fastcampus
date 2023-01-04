package class8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

    public static void main(String[] args) {

//        FileInputStream fis = null;

        try (FileInputStream fis = new FileInputStream("a.txt")) {
            System.out.println("read");
        } catch (FileNotFoundException e) { // Exception for file not found
            e.printStackTrace();
        } catch (IOException e) {           // Exception When Closing Null
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
