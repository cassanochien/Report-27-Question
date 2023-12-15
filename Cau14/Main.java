package Cau14;

public class Main {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(20);
        myQueue.enqueue(5);
        myQueue.enqueue(2);
        myQueue.enqueue(10);
        myQueue.enqueue(8);
        myQueue.enqueue(6);
        myQueue.printQueue();
        System.out.println();
        myQueue.traverse();
        System.out.println();
        System.out.println(myQueue.dequeue());
        myQueue.printQueue();
        System.out.println();
        myQueue.clear();
        myQueue.printQueue();
        System.out.println();
    }
}
