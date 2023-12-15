package Cau20;

public class Main {
    public static void main(String[] args) {
        TreeNode node01 = new TreeNode(25);
        TreeNode node02 = new TreeNode(20);
        TreeNode node03 = new TreeNode(15);
        TreeNode node04 = new TreeNode(27);
        Tree intTree = new Tree();
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);
        System.out.println("Goc Trai Phai");
        intTree.traversePreOrder();
        System.out.println("\nTrai Goc Phai");
        intTree.traverseInOrder();
        System.out.println("\nTrai Phai Goc");
        intTree.traversePostOrder();
        System.out.println();
        System.out.println(intTree.search(15));
        System.out.println("MIN: " + intTree.min());
        System.out.println("MAX: " + intTree.max());
        System.out.println("Count :" + intTree.count());
    }
}
