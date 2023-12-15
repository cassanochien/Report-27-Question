package Cau3;

public class Main {
    public static void main(String[] args) {
        Singly s1 = new Singly("Trung", 10000, 20);
        Singly s2 = new Singly("Ca", 10000, 30);
        Singly s3 = new Singly("Thit", 20000, 10);
        Singly s4 = new Singly("Gao", 15000, 50);
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst(s1);
        list.addFirst(s2);
        list.addFirst(s3);
        list.addFirst(s4);
        list.printList();
        System.out.println("Number of items " + list.count());
    }
}
