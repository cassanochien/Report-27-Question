package Cau14;

import java.util.EmptyStackException;

public class MyQueue {
    public int[] queue;
    private int back = 0;
    private int front = 0;

    public MyQueue(int capacity) {
        queue = new int[capacity];
    }

    public void enqueue(int e) {
        if (queue.length == back) {
            int[] newArray = new int[queue.length * 2];
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        }
        queue[back] = e;
        back++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int e = queue[front];
        queue[front] = 0;
        front++;
        if (size() == 0) {
            front = 0;
            back = 0;
        }
        return e;
    }

    public int first() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return queue[front];
    }

    public void printQueue() {
        for (int i = front; i < back; i++) {
            System.out.println("" + queue[i]);
        }
    }

    public void traverse() {
        for (int i = back; i >= front; i--) {
            System.out.println("" + queue[i]);
        }
    }

    public int size() {
        return back - front;
    }

    public void clear() {
        for (int i = front; i < back; i++) {
            queue[i] = 0;
        }
        front = 0;
        back = 0;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int getBack() {
        return back;
    }

    public void setBack(int back) {
        this.back = back;
    }

    public int getFront() {
        return front;
    }

    public void setFront(int front) {
        this.front = front;
    }
}
