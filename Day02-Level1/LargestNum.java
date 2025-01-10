import java.util.*;
public class LargestNum{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
int num3=sc.nextInt();
int largest=num1;
if(largest<num2){
System.out.println("num1 is not the largest");
}
else if(largest<num3){
System.out.println("num1 is not the largest");
}
else{
System.out.println("num1 is largest");
}
}
}