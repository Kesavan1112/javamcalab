public class reverseword
{
public void reversewords(String str){
String []words=str.split(" ");
String revstr="";
for(int i=0;i<words.length;i++)
{
String word=words[i];
String revword="";

for(int j=word.length()-1;j>=0;j--)
{
revword=revstr+word.charAt(j);
}
revstr=revstr+revword+"";
}
System.out.println(str);
System.out.println(revstr);
}
public static void main(String args[])
{
reverseword ob=new reverseword();
ob.reversewords("rose is a beautiful\n");
}
}
