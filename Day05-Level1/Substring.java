import java.util.*;

public class Substring {
    public static String findString(String str, int start, int end) {
        String res = "";
        for (int i = start; i < end; i++) {
            res = res + str.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int start = 2;
        int end = 5;

        String ans1 = str.substring(2, 5);
        String ans2 = findString(str, start, end);
        if (ans1.equals(ans2)) {
            System.out.println("Result are same");
        } else {
            System.out.println("Result are not same");
        }
    }
}
