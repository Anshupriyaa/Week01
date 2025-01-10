import java.util.Scanner;
public class Fact1 {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a positive integer: ");
int number = sc.nextInt();
if (number >= 0) {
int fact = 1;
for (int i = 1; i <= number; i++) {
fact=fact*i;
}
System.out.println("Factorial of " + number + " is " + fact);
} else {
System.out.println("Enter a positive integer.");
}
}
}