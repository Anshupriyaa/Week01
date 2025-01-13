import java.util.*;

public class CompareTwoStrings {
    public static boolean compareStringsWithoutEquals(String name1, String name2) {
        if (name1.length() != name2.length()) {
            return false;
        }
        for (int i = 0; i < name1.length(); i++) {
            if (name1.charAt(i) != name2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name");
        String name1 = sc.next();
        System.out.println("Enter second name");
        String name2 = sc.next();
        boolean ans1 = compareStringsWithoutEquals(name1, name2);
        // In-built method
        boolean ans2 = name1.equals(name2);
        if (ans1 && ans2) {
            System.out.println("Results are same");
        } else {
            System.out.println("results are not same");
        }
    }
}








