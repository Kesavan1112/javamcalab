import java.io.*;
import java.net.*;

public class DirectoryServer {
    public static void main(String[] args) {
        int port = 12345; // Server port

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is listening on port " + port);

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("New client connected");

                // Create a new thread for each client
                new Thread(new DirectoryHandler(socket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class DirectoryHandler implements Runnable {
    private Socket socket;

    public DirectoryHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try (BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter output = new PrintWriter(socket.getOutputStream(), true)) {

            String dirName = input.readLine(); // Read directory name from client
            File directory = new File(dirName);

            if (directory.exists()) {
                output.println("already exist"); // Send message if directory exists
            } else {
                if (directory.mkdir()) {
                    output.println("successfully created"); // Send success message
                } else {
                    output.println("failed to create directory"); // Send failure message
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close(); // Close the socket
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
