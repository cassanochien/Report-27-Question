package Cau4;

public class HangHoaNode {
    private HangHoa hangHoa;
    private HangHoaNode next;
    private HangHoaNode previous;

    public HangHoaNode(HangHoa hangHoa) {
        this.hangHoa = hangHoa;
    }

    public HangHoa getHangHoa() {
        return hangHoa;
    }

    public void setHangHoa(HangHoa hangHoa) {
        this.hangHoa = hangHoa;
    }

    public HangHoaNode getNext() {
        return next;
    }

    public void setNext(HangHoaNode next) {
        this.next = next;
    }

    public HangHoaNode getPrevious() {
        return previous;
    }

    public void setPrevious(HangHoaNode previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return "HangHoaNode [hangHoa=" + hangHoa + ", next=" + next
                + ", previous=" + previous + "]";
    }
}
