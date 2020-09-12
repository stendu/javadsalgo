package ValidBST;

public class Node {
    private int value;
    private Node left;
    private Node right;

    public Node(int value) {
        this.value = value;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public boolean validBST(Node node, int lowValue, int highValue) {
        if (node == null) {
            return true;
        }
        if ((node.getValue() > lowValue) && (node.getValue() < highValue)) {
            return validBST(node.getLeft(),-999,node.getValue()) &&
                    validBST(node.getRight(),node.getValue(),999);
        } else {
            return false;
        }
       
    }
}
