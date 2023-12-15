package Cau3;

public class SinglyLinkedList {
    private SinglyNode head;
    private int size = 0;

    public SinglyLinkedList() {
    }

    public void addFirst(Singly singly) {
        SinglyNode newNode = new SinglyNode(singly);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    public void printList() {
        if (size == 0) {
            System.out.println("Chưa có dữ liệu!");
        } else {
            SinglyNode current = head;
            System.out.println("HEAD =>");
            while (current != null) {
                System.out.println("" + current.getSingly().toString());
                System.out.println("->");
                current = current.getNext();
            }
            System.out.println("NULL");
        }
    }

    public int count() {
        return this.size;
    }
}
