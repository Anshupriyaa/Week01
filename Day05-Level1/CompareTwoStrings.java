import java.util.*;

public class CompareTwoStrings {
    //created method for comparing two String without equals() method 
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
        //Created one Scanner class for taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name");
        // we will store first string in our variable name1
        String name1 = sc.next();
        System.out.println("Enter second name");
        // we will store second string in our variable name2
        String name2 = sc.next();
        //calling our created method to get result
        boolean ans1 = compareStringsWithoutEquals(name1, name2);
        // In-built method .equals() for comapring two stringsw
        boolean ans2 = name1.equals(name2);
        if (ans1 && ans2) {
            System.out.println("Results are same");
        } else {
            System.out.println("results are not same");
        }
    }
}








