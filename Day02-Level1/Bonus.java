import java.util.Scanner;
public class Bonus {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the salary: ");
double salary = sc.nextDouble();
System.out.print("Enter years of service: ");
int yearOfService = sc.nextInt();
if (yearOfService > 5) {
double bonus = salary * 0.05;
System.out.println("Bonus amount: " + bonus);
} else {
System.out.println("No bonus for employees with less than or equal to 5 years of service.");
}
}
}