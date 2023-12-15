public class Test {
static int n1 = 0, n2 = 1, n3 = 0;
 
    static void printFibo(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            printFibo(count - 1);
        }
    }
 
    public static void main(String[] args) {
        int count = 20;
        System.out.print(n1 + " " + n2); // in 0 và 1
        printFibo(count - 2);// n-2 vì 2 số 0 và 1 đã được in ra
    }
}