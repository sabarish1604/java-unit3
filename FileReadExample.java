import java.io.*;

public class FileReadExample {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("no-such-file.txt");
            System.out.println("File opened successfully");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}
