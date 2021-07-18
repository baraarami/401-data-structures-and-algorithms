package Trees;

import java.util.ArrayList;

public class BinaryTree<T> {
    Node root;

    ArrayList<T> tree = new ArrayList<T>();

    //pre order : root >> left >> right

    public ArrayList<Object> preOrder(Node root){
        ArrayList<Object> output = new ArrayList<Object>();
        try {
            if (root == null){
                return output;
            }else {
                output.add(root.value);
                if (root.left != null)
                    output.addAll(preOrder(root.left));

                if (root.right != null)
                    output.addAll(preOrder(root.right));
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
        return output;
    }


    //in order : left >> root >> right
    public ArrayList<Object> inOrder(Node root){
        ArrayList<Object> output = new ArrayList<Object>();
        try {
            if (root == null){
                return output;
            }else {
                output.add(root.value);
                if (root.left != null)
                    output.addAll(inOrder(root.left));

                if (root.right != null)
                    output.addAll(inOrder(root.right));
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
        return output;
    }


    //post order : left >> right >> root
    public ArrayList<Object> postOrder(Node root){
        ArrayList<Object> output = new ArrayList<Object>();
        try {
            if (root == null){
                return output;
            }else {
                output.add(root.value);
                if (root.left != null)
                    output.addAll(postOrder(root.left));

                if (root.right != null)
                    output.addAll(postOrder(root.right));
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
        return output;
    }

}
