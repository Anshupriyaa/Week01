import java.util.*;
public class Sum1{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter your num");
double num=sc.nextDouble();
double total=0.0;
while(num!=0&&num>0){
total=total+num;
System.out.println("Enter again");
num=sc.nextInt();
if(num<=0){
break;
}
}
System.out.println(total);
}
}