import java.util.*;
public class UniversityFee{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int fee=sc.nextInt();
int discountPercent=sc.nextInt();
double discountAmount=(fee*discountPercent)/100;
double discountedPrice=fee-discountAmount;
System.out.println(" The discount amount is INR "+discountAmount + " and the final fee is INR " + discountedPrice );
}
}
