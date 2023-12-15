package Cau3;

public class SinglyNode {
    private Singly singly;
    private SinglyNode next;

    public SinglyNode(Singly singly) {
        this.singly = singly;
    }

    public Singly getSingly() {
        return singly;
    }

    public void setSingly(Singly singly) {
        this.singly = singly;
    }

    public SinglyNode getNext() {
        return next;
    }

    public void setNext(SinglyNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "SinglyNode [singly=" + singly + ", next=" + next + "]";
    }
}
