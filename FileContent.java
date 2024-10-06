import java.util.Scanner;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class FileContent {
    public static void main(String[] args) {
        String fname;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter File Name to open (with extension like file.txt): ");
        fname = scan.nextLine();
        String line = null;

        try {
            // File reading setup
            FileReader fr = new FileReader(fname);
            BufferedReader bufferedReader = new BufferedReader(fr);
            
            // Reading file line by line
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // Get file path and size
            Path filepath = Paths.get(fname);
            long fileSize = Files.size(filepath);

            // Get file attributes (size, creation time, etc.)
            BasicFileAttributes attr = Files.readAttributes(filepath, BasicFileAttributes.class);
            System.out.format("The size of the file: %d bytes\n", fileSize);
            System.out.println("Creation Time: " + attr.creationTime());

            // Close the bufferedReader
            bufferedReader.close();

        } catch (IOException ex) {
            System.out.println("Error in reading file named '" + fname + "'");
        }
    }
}
