package Cau1;

public class SinglyLinkedList {
    private SinglyNode head;
    private int size = 0;

    public void addFirst(int s) {
        SinglyNode newSingly = new SinglyNode(s);
        newSingly.setNext(head);
        head = newSingly;
        size++;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public SinglyNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }
        SinglyNode removeNode = head;
        head = head.getNext();
        size--;
        removeNode.setNext(null);
        return removeNode;
    }

    public void printList() {
        SinglyNode current = head;
        System.out.println("HEAD =>");
        while (current != null) {
            System.out.println("" + current);
            System.out.println("->");
            current = current.getNext();
        }
        System.out.println("NULL");
    }

    public int count() {
        return this.size;
    }
}
