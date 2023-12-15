package Cau12;

public class Main {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(30);
        myQueue.enq(5);
        myQueue.enq(3);
        myQueue.deq();
        myQueue.enq(2);
        myQueue.enq(8);
        myQueue.deq();
        myQueue.enq(9);
        myQueue.enq(1);
        myQueue.deq();
        myQueue.enq(7);
        myQueue.enq(6);
        myQueue.deq();
        myQueue.deq();
        myQueue.enq(4);
        myQueue.deq();
        myQueue.deq();
        myQueue.printQueue();
    }
}
