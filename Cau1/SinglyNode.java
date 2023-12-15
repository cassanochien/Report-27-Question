package Cau1;

public class SinglyNode {
    private int singly;
    private SinglyNode next;

    public SinglyNode(int singly) {
        this.singly = singly;
    }
    public SinglyNode() {
    }
    public int getSingly() {
        return singly;
    }
    public void setSingly(int singly) {
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
        return "SinglyNode [singly=" + singly + "]";
    }
}
