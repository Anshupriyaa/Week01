import java.util.*;

public class Substring {
    //Created method for finding substring of a string 
    public static String findString(String str, int start, int end) {
        String res = "";
        for (int i = start; i < end; i++) {
            res = res + str.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        // created a Scanner class for taking input from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String: ");
        String str = sc.next();
        // start and end are two variables to indicate from where we have to start are substring and end our substring
        int start = 2;
        int end = 5;
      
        String ans1 = str.substring(2, 5);// here we are finding substring with the help of in-built method  
        String ans2 = findString(str, start, end);// called method findString
        // comparing both the answer
        if (ans1.equals(ans2)) {
            System.out.println("Result are same");
        } else {
            System.out.println("Result are not same");
        }
    }
}
