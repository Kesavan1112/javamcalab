import java.io.*;
import java.net.*;
public class Client
{
public static void main(String[]args)
{
String serverAddress="localhost";
int serverPort=12345;
try{
Socket socket=new Socket(serverAddress,serverPort);
BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
PrintWriter out=new PrintWriter(socket.getOutputStream(),true);
BufferedReader userInput=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter Directory Name:");
String directoryName=userInput.readLine();
System.out.println(directoryName);
String response=in.readLine();
System.out.println("Server Response:"+response);
socket.close();
}
catch(IOException e)
{
e.printStackTrace();
}}}
