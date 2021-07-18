package Trees;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.add(5);
        binarySearchTree.add(1);
        binarySearchTree.add(7);
        binarySearchTree.add(10);

        System.out.println(binarySearchTree.contains(7));
        System.out.println(binarySearchTree.contains(8));
        System.out.println(binarySearchTree.contains(-1));
        System.out.println("Pre Order :" + binarySearchTree.preOrder(binarySearchTree.root));
        System.out.println("In Order :" + binarySearchTree.inOrder(binarySearchTree.root));
        System.out.println("Post Order :"+ binarySearchTree.postOrder(binarySearchTree.root));
        System.out.println(binarySearchTree);
    }
}
