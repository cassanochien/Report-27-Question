package Cau19;

public class Main {
    static boolean ispalindrome(char c[], int n) {
        if (n == 1) {
            return true;
        }
        int m = c.length;
        if (c[n - 1] != c[m - n]) {
            return false;
        } else {
            return ispalindrome(c, n - 1);
        }
    }

    public static void main(String[] args) {
        char[] n = { 'a', 'b', 'c', 'c', 'b', 'a' };
        boolean check = ispalindrome(n, n.length);
        if (check) {
            System.out.println("is Palindrome");
        } else {
            System.out.println("is not Palindrome");
        }
    }
}
