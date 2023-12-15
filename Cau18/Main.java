package Cau18;

public class Main {
    public static int findsum(int[] array, int length) {
        if (length == 1)
            return array[0];
        return array[length - 1] + findsum(array, length - 1);
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 8 };
        System.out.println(findsum(numbers, numbers.length));
    }
}
