package Cau4;

import java.util.Calendar;

public class HangHoaDoubleLinkedList {
    private HangHoaNode head;
    private HangHoaNode tail;
    private int size = 0;

    public void insertAtHead(HangHoa hangHoa) {
        HangHoaNode newNode = new HangHoaNode(hangHoa);
        if (head == null) {
            tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrevious(newNode);
        }
        head = newNode;
        size++;
    }

    public void insertAtTail(HangHoa hangHoa) {
        HangHoaNode newNode = new HangHoaNode(hangHoa);
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

    public void removeHangHoa() {
        HangHoaNode current = head;
        head = null;
        tail = null;
        size = 0;
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        while (current != null) {
            int hieuSo = (current.getHangHoa().getNamBaoHanh() +
                    current.getHangHoa().getNamSanXuat()) - year;
            System.out.println(hieuSo < 0);
            if (hieuSo >= 0) {
                insertAtHead(current.getHangHoa());
            }
            current = current.getNext();
        }
    }

    public int count() {
        return size;
    }

    public void printList() {
        HangHoaNode current = head;
        System.out.println("HEAD =>");
        while (current != null) {
            System.out.println("" +
                    current.getHangHoa().toString());
            System.out.println(" <=> ");
            current = current.getNext();
        }
        System.out.println("NULL");
    }
}
