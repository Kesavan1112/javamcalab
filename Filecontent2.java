 
    



import java.util.Scanner;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
public class  Filecontent2
{
public static void main(String[]args)
{
String fname;
Scanner scan=new Scanner(System.in);
System.out.print("Enter File Name to open (with extension like file.txt):");
fname=scan.nextLine();
String line=null;
try{
FileReader fr=new FileReader(fname);
BufferedReader bufferedReader=new BufferedReader(fr);
while((line = bufferedReader.readLine())!=null)
{
System.out.println(line);
}
Path filepath=Paths.get(fname);
long filesiz=Files.size(filepath);

Path file=Paths.get(fname);
BasicFileAttributes attr=Files.readAttributes(file,BasicFileAttributes.class);
System.out.format("the size of the file:%d byte",filesiz);
System.out.println("\ncreationTime:"+attr.creationTime());
bufferedReader.close();
}

catch(IOException ex)
{
System.out.println("error in reading file named'"+fname+"");
}}
}
 

