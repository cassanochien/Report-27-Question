package Cau4;

public class Main {
    public static void main(String[] args) {
        HangHoa hangHoa1 = new HangHoa(0, "Roi", "kim loai", 2018, 2);
        HangHoa hangHoa2 = new HangHoa(1, "Kiem", "kim loai", 2020, 5);
        HangHoa hangHoa3 = new HangHoa(2, "Ban", "kim loai", 2021, 4);
        HangHoaNode c = new HangHoaNode(hangHoa2);
        HangHoaDoubleLinkedList a = new HangHoaDoubleLinkedList();
        a.insertAtHead(hangHoa1);
        a.insertAtHead(hangHoa2);
        a.insertAtHead(hangHoa3);
        a.printList();
        a.removeHangHoa();
        a.printList();
        System.out.println("Số lượng: " + a.count());
    }
}
