package Cau2;

public class Main {
    public static void main(String[] args) {
        Patient a1 = new Patient(0, "Long", "Nguyen", "No", 100);
        Patient a2 = new Patient(1, "Tinh", "Nguyen", "No", 155);
        Patient a3 = new Patient(2, "An", "Ngo", "Yen", 105);
        Patient a4 = new Patient(3, "Hoang", "Tran", "No", 185);
        Patient a5 = new Patient(4, "Ngoc", "Huynh", "No", 185);
        PatientDoublyLinkedList c = new PatientDoublyLinkedList();
        c.insertAtTail(a1);
        c.insertAtTail(a2);
        c.printList();
        System.out.println(c.count());
        PatientDoublyLinkedList c1 = new PatientDoublyLinkedList();
        c1.insertAtHead(a1);
        c1.insertAtHead(a2);
        c1.insertAtHead(a3);
        c1.insertAtHead(a4);
        c1.insertAtHead(a5);
        c1.printList();
        System.out.println(c1.count());
        c1.sortByName();
        c1.printList();
    }
}
