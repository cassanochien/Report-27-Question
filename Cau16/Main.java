package Cau16;

public class Main {
    public static int fact(int n) {
        if (n <= 1)
            return 1;
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("5! = " + fact(5));
        System.out.println("10! = " + fact(10));
    }
}
