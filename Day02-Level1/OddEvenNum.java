import java.util.Scanner;
public class OddEvenNum {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a positive integer: ");
int num = sc.nextInt();
if (num > 0) {
for (int i = 1; i <= num; i++) {
if (i % 2 == 0) {
System.out.println(i + " is even");
} else {
System.out.println(i + " is odd");
}
}
} else {
System.out.println("Enter a positive integer.");
}
}
}