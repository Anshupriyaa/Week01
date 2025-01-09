import java.util.*;
public class Swapping{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
int num=num1;
num1=num2;
num2=num;
System.out.println(" The swapped numbers are "+ num1+ " and "+ num2);
}
}