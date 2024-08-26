import java.util.*;
import java.util.Vector;
import java.io.*;
public class Menudrive {
    public static void main(String args[])
    {
        int choice=0,position;
        Scanner sc=new Scanner(System.in);
        Vector v=new Vector();
        String s,city,ucity;
        try{
            do{
                System.out.println("01.Add Element");
                System.out.println("02.Remove Element");
                System.out.println(" 03.Update Element");
                System.out.println("04.Display Element");

                System.out.println("05.Exit");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            System.out.println("Enter City Name:");
            city=sc.next();
            if(v.contains(city))
            {
                System.out.println("city name already exist");

            }
            else
            {
                v.addElement(city);
                System.out.println("city name added");

            }
            break;
            case 2:
            if(v.isEmpty())
            {
                System.out.println("city name list is empty.");

            }
            else
            {
                System.out.println("enter city name");
                city=sc.next();
                if(v.contains(city))
                {
                    v.removeElement(city);
                    System.out.println("city name removed");
                }
                else{
                    System.out.println("city name does not exist");
                }

            }
            break;
case 3:
if(v.isEmpty())
{
    System.out.println("city name list is empty");
}
else{
    System.out.println("Enter the position of city Name to update");
    position=sc.nextInt();
System.out.println("Enter Updated City Name:");
ucity=sc.next();
v.setElementAt(ucity,position);
}
break;
case 4:
if(v.isEmpty())
{
    System.out.println("City Name List is Empty.");
}
else{
    System.out.println("Vector:"+v.toString());


}
    break;
case 5:
System.exit(0);
break;


}
System.out.println("do you want to continue ? Press Y for Yes or Press N for No ");
s=sc.next();
            }
            while(s.equals("Y"));
        }
        catch(Exception e)
        {
            System.out.println("Exception caught:"+e);
        }
    }
}
