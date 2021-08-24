package TreeIntersection;

import Tree.BinarySearchTree;
import hashtable.Hashtable;

public class TreeIntersection {
    public static void main(String[] args) {
        BinarySearchTree first = new BinarySearchTree();
        BinarySearchTree second = new BinarySearchTree();

        first.add(5);
        first.add(1);
        first.add(7);
        first.add(11);
        first.add(10);
        first.add(4);
        first.add(8);
        first.add(7);


        Hashtable hashtable = treeIntersection (first , second);

    }
    public static Hashtable treeIntersection(BinarySearchTree first , BinarySearchTree second){
        Hashtable common = new Hashtable();
        if (first.root == null || second.root == null ){
            return null;
        }
        for (int i=0 ; i < first.inOrder(first.root).size() ; i++){
            if (second.contains(i)){
                common.add(i , i);
            }
        }
        System.out.println(common);
        return common;
    }
}
