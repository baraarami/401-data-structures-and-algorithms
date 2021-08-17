package Tree;

import java.util.ArrayList;

public class BinaryTree <T>{
    public NodeTree root;


    public ArrayList<T> getTree(){
        return tree;
    }

    public void setTree(ArrayList<T> tree){
        this.tree = tree ;
    }

    ArrayList<T> tree = new ArrayList<T>();


    public ArrayList<Object> preOrder(NodeTree root){
        ArrayList<Object> output = new ArrayList<Object>();
        try {
            if (root == null){
                return output;
            }else{
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


    public ArrayList<Object> inOrder(NodeTree root){
        ArrayList<Object> output = new ArrayList<Object>();
        try {
            if (root == null){
                return output;
            }else{
                if (root.left != null)
                    output.addAll(inOrder(root.left));
                output.add(root.value);

                if (root.right != null)
                    output.addAll(inOrder(root.right));
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
        return output;
    }


    public ArrayList<Object> postOrder(NodeTree root){
        ArrayList<Object> output = new ArrayList<Object>();
        try {
            if (root == null){
                return output;
            }else{
                if (root.left != null)
                    output.addAll(postOrder(root.left));


                if (root.right != null)
                    output.addAll(postOrder(root.right));
                output.add(root.value);
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
        return output;
    }





}
