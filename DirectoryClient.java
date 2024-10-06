import java.io.*;
import java.net.*;

public class DirectoryClient {
    public static void main(String[] args) {
        String host = "localhost"; // Server address
        int port = 12345; // Server port

        try (Socket socket = new Socket(host, port);
             PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter directory name to create: ");
            String dirName = userInput.readLine(); // Get directory name from user

            output.println(dirName); // Send directory name to server
            String response = input.readLine(); // Read response from server
            System.out.println(response); // Print server response

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
