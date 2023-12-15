package Cau12;

public class MyQueue {
    public int[] queue;
    private int back = 0;
    private int front = 0;

    public MyQueue(int capacity) {
        queue = new int[capacity];
    }

    public void enq(int e) {
        if (queue.length == back) {
            int[] newArray = new int[queue.length * 2];
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        }
        queue[back] = e;
        back++;
    }

    public void printQueue() {
        for (int i = front; i < back; i++) {
            System.out.println("" + queue[i]);
        }
    }

    public int size() {
        return back - front;
    }

    public int deq() {
        if (this.size() == 0) {
            System.out.println("The Queue is Empty");
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
