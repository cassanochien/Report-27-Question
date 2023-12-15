package Cau2;

public class PatientDoublyLinkedList {
    private PatientNode head;
    private PatientNode tail;
    private int size = 0;

    public void insertAtHead(Patient patient) {
        PatientNode newNode = new PatientNode(patient);
        if (head == null) {
            tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrevious(newNode);
        }
        head = newNode;
        size++;
    }

    public void insertAtTail(Patient patient) {
        PatientNode newNode = new PatientNode(patient);
        if (tail == null) {
            head = newNode;
        } else {
            newNode.setPrevious(tail);
            tail.setNext(newNode);
        }
        tail = newNode;
        size++;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public PatientNode removeFromEnd() {
        if (isEmpty()) {
            return null;
        }
        PatientNode removedNode = tail;
        if (tail.getPrevious() == null) {
            head = null;
        } else {
            tail.getPrevious().setNext(null);
        }
        tail = tail.getPrevious();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public void printList() {
        PatientNode current = head;
        System.out.println("HEAD =>");
        while (current != null) {
            System.out.println("" +
                    current.getPatient().toString());
            System.out.println(" <=> ");
            current = current.getNext();
        }
        System.out.println("NULL");
    }

    public void sortByName() {
        PatientNode current = null, index = null;
        Patient temp;
        if (head == null) {
            return;
        } else {
            for (current = head; current.getNext() != null; current = current.getNext()) {
                for (index = current.getNext(); index != null; index = index.getNext()) {
                    String a = current.getPatient().getFirstName();
                    char[] charArray1 = a.toCharArray();
                    String b = index.getPatient().getFirstName();
                    char[] charArray2 = b.toCharArray();
                    if (Character.compare(charArray1[0],
                            charArray2[0]) > 0) {
                        temp = current.getPatient();
                        current.setPatient(index.getPatient());
                        index.setPatient(temp);
                    }
                }
            }
        }
    }

    public int count() {
        return this.size;
    }
}
