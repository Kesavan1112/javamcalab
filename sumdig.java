import java.util.*;
public class sumdig {
    public static void main(String args[]){
int num,sum=0;
Scanner sq=new Scanner(System.in);
num=sq.nextInt();
int temp;
while(num>0){
 temp=num%10;
sum=sum+temp;
num=num/10;
}
System.out.println(sum);

    }
    
}
