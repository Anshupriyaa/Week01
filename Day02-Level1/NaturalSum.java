import java.util.Scanner;
public class NaturalSum {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter a natural number ");
 int n = sc.nextInt();
if (n > 0) {
// Computing sum using formula
int sumFormula = n * (n + 1) / 2;
// Computing sum using a while loop
int sumLoop = 0;
int count = 1;
while (count <= n) {
sumLoop += count;
count++;
}
System.out.println("Sum using formula: " + sumFormula);
System.out.println("Sum using while loop: " + sumLoop);
if (sumFormula == sumLoop) {
System.out.println("Both results are same");
} else {
System.out.println("Both results are different");
}
} else {
System.out.println("Please enter a positive natural number.");
}
}
}