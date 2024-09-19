import java.io.*;
import java.net.*;
public class Server
{
public static void main(String args[])
{
int port=1235;
try{
ServerSocket serverSocket=new ServerSocket(port);
System.out.println("server is listening on port"+port);

while(true)
{
Socket socket=serverSocket.accept();
System.out.println("client connected :"+socket.getInetAddress());
BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
PrintWriter out=new PrintWriter(socket.getOutputStream(),true);
String  directoryName=in.readLine();
File directory=new File(directoryName);
if(directory.exists()&&directory.isDirectory())
{
System.out.println("Directory Already Exist");
}
else
{
if(directory.mkdirs())
{
System.out.println("successfully created");
}
else
{
System.out.println("failed to created Directory");
}
}
socket.close();
}
}
catch(IOException e)
{
e.printStackTrace();
}

}}

