import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Date;
 class Seven_b
{
public static void main(String args[])
{
DateTimeFormatter  dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
LocalDateTime now=LocalDateTime.now();
System.out.println(dtf.format(now));
SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
Date date=new Date();
System.out.println(formatter.format(date));
}
}



