package Cau20;

public class TreeNode {
    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if (value == data) {
            return;
        }
        if (value < data) {
            if (leftChild == null) {
                leftChild = new TreeNode(value);
            } else {
                leftChild.insert(value);
            }
        }
        if (value > data) {
            if (rightChild == null) {
                rightChild = new TreeNode(value);
            } else {
                rightChild.insert(value);
            }
        }
    }

    public int max() {
        if (getRightChild() == null) {
            return data;
        } else {
            return getRightChild().max();
        }
    }

    public int min() {
        if (getLeftChild() == null) {
            return data;
        } else {
            return getLeftChild().min();
        }
    }

    public TreeNode search(int value) {
        if (value == data) {
            return this;
        }
        if (value < data) {
            if (leftChild != null) {
                return leftChild.search(value);
            }
        }
        else {
            if (rightChild != null) {
                return rightChild.search(value);
            }
        }
        return null;
    }

    public void traversePreOrder() {
        System.out.print(data + ", ");
        if (leftChild != null) {
            leftChild.traversePreOrder();
        }
        if (rightChild != null) {
            rightChild.traversePreOrder();
        }
    }

    public void traverseInOrder() {
        if (leftChild != null) {
            leftChild.traverseInOrder();
        }
        System.out.print(data + ", ");
        if (rightChild != null) {
            rightChild.traverseInOrder();
        }
    }

    public void traversePostOrder() {
        if (leftChild != null) {
            leftChild.traversePostOrder();
        }
        if (rightChild != null) {
            rightChild.traversePostOrder();
        }
        System.out.print(data + ", ");
    }

    public int count() {
        TreeNode right = getRightChild();
        TreeNode left = getLeftChild();
        int c = 1;
        if (right != null)
            c += right.count();
        if (left != null)
            c += left.count();
        return c;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "TreeNode [data=" + data + ", leftChild=" + leftChild
                + ", rightChild=" + rightChild + "]";
    }
}
