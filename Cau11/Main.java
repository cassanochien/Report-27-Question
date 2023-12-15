package Cau11;

public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack(20);
        stack.push(20);
        stack.push(9);
        stack.push(7);
        stack.push(10);
        stack.push(5);
        stack.push(58);
        stack.printStack();
        System.out.println();
        stack.traverse();
        stack.clear();
        System.out.println();
        stack.printStack();
    }
}
