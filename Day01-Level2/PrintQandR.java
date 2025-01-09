import java.util.*;
public class PrintQandR{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
double quotient=num1/num2;
int reminder=num1%num2;
System.out.println("The Quotient is " + quotient + " and reminder is "+ reminder +" of two number " + num1 + " and " +num2);
}
}