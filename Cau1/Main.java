package Cau1;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList a1 = new SinglyLinkedList();
        a1.addFirst(1);
        a1.addFirst(2);
        a1.addFirst(3);
        a1.addFirst(4);
        a1.addFirst(5);
        a1.printList();
        a1.removeFromFront();
        a1.printList();
        System.out.println("Size" + a1.count());
    }
}
