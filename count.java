import java.util.Scanner;
public class count
{
public static void main(String args[])
{
Scanner r=new Scanner(System.in);
System.out.println("Enter a sentence :\n");
String input=r.nextLine();
int uppercasecount=0;
int lowercasecount=0;
int digitcount=0;
int whitespacecount=0;
for(int i=0;i<input.length();i++)
{
char ch=input.charAt(i);
if(Character.isUpperCase(ch))
{
uppercasecount++;
}
else if(Character.isLowerCase(ch))
{
lowercasecount++;
}else if(Character.isDigit(ch))
{
digitcount++;
}
else if(Character.isWhitespace(ch))
{
whitespacecount++;
}
}
System.out.println("\nupper case letter:"+uppercasecount);
System.out.println("Lower case letter:"+lowercasecount);
System.out.println("digits:"+digitcount);
System.out.println("white spaces:"+whitespacecount);
r.close();
}
}

