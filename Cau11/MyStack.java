package Cau11;

import java.util.EmptyStackException;

public class MyStack {
    private int[] stack;
    private int top;

    public MyStack(int capacity) {
        stack = new int[capacity];
    }

    public void push(int value) {
        if (top == stack.length) {
            int[] newStack = new int[stack.length * 2];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }
        stack[top++] = value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int value = stack[top - 1];
        stack[top - 1] = 0;
        top--;
        return value;
    }

    public int top() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top - 1];
    }

    public void clear() {
        while (top != 0) {
            stack[top - 1] = 0;
            top--;
        }
    }

    public int size() {
        return top;
    }

    public void printStack() {
        if (top == 0) {
            System.out.println("Null");
        } else {
            for (int i = top - 1; i >= 0; i--) {
                System.out.print(" " + stack[i]);
            }
        }
    }

    public void traverse() {
        if (top == 0) {
            System.out.println("Null");
        } else {
            for (int i = 0; i < top; i++) {
                System.out.print(" " + stack[i]);
            }
        }
    }

    public boolean isEmpty() {
        return top == 0;
    }
}
