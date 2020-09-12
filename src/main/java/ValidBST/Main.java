package ValidBST;

public class Main {
    public static void main(String[] args) {
        Node root = new Node(5);
        root.setLeft(new Node(3));
        root.getLeft().setLeft(new Node(2));
        root.getLeft().setRight(new Node(4));
        root.setRight(new Node(7));
        root.getRight().setLeft(new Node(6));
        root.getRight().setRight(new Node(9));

        System.out.println("Check whether tree is valid BST: " + root.validBST(root, -999, 999));
    }
}
