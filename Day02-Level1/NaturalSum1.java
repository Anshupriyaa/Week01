import java.util.Scanner;
public class NaturalSum1 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter a natural number ");
int n = sc.nextInt();
if (n > 0) {
// Compute sum using the formula
int sumFormula = n * (n + 1) / 2;
// Compute sum using a for loop
int sumLoop = 0;
for (int i = 1; i <= n; i++) {
sumLoop += i;
}
// Compare the results
System.out.println("Sum using formula: " + sumFormula);
System.out.println("Sum using for loop: " + sumLoop);
if (sumFormula == sumLoop) {
System.out.println("Both computations match!");
} else{
System.out.println("Both computations are different");
}
} else{
System.out.println("Enter a positive natural number.");
}
}
}