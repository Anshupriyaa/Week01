import java.util.*;
public class SimpleInterest{
//Created method named "calculateSimpleInterest" for calculating Simple Interest
public static void calculateSimpleInterest(int principle,int rate,int time){
//calculated Simple Interest with the help of formulla
float SI=(principle*rate*time)/100;
System.out.println("Simple Interest for given number is: "+SI);
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter principle");
int principle=sc.nextInt();
System.out.println("Enter rate");
int rate=sc.nextInt();
System.out.println("Enter time");
int time=sc.nextInt();
//calling method calculateSimpleInterest
calculateSimpleInterest(principle,rate,time);
}
}
