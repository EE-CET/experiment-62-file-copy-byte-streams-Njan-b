import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {

        try {
            // Create FileInputStream to read from source.txt
            FileInputStream fis = new FileInputStream("source.txt");

            // Create FileOutputStream to write to destination.txt
            FileOutputStream fos = new FileOutputStream("destination.txt");

            int data;

            // Read byte by byte and write into destination file
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            // Close both streams
            fis.close();
            fos.close();

            System.out.println("File Copied");

            // Now display contents of destination.txt
            FileInputStream display = new FileInputStream("destination.txt");

            while ((data = display.read()) != -1) {
                System.out.print((char) data);
            }

            display.close();

        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}