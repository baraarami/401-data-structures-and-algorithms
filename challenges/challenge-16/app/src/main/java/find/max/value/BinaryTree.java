import java.util.ArrayList;

public class BinaryTree <T> {

    Node root;

    ArrayList<T> tree = new ArrayList<T>();


    public ArrayList<Object> preOrder(Node root){
        ArrayList<Object> output = new ArrayList<Object>();
        try{
            if( root == null){
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



    //inorder

    public ArrayList<Object> inOrder (Node root) {
        ArrayList<Object> output = new ArrayList<Object>();
        try {
            if (root == null) {
                return output;
            } else {
                if (root.left != null)
                    output.addAll(preOrder(root.left));
                output.add(root.value);

                if (root.right != null)
                    output.addAll(preOrder(root.right));


            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return output;
    }


    //postorder

    public ArrayList<Object> postOrder(Node root){
        ArrayList<Object> output = new ArrayList<Object>();
        try{
            if( root == null){
                return output;
            }else {
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


    public void add(Object value){
        Node addedNode = new Node(value);
        Node current = this.root;
        try {
            if (this.root == null){
                this.root = addedNode;
            }else {
                while (current != null){
                    if ((int) current.value > (int) value){
                        if (current.left == null){
                            current.left = addedNode;
                            break;
                        }
                        current= current.left;
                    }else {
                        if (current.right == null){
                             current.right = addedNode;
                             break;
                        }
                        current= current.right;
                    }
                }
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Override
    public String toString(){
        return "Binary Tree { "+ " root = " + root + " , tree " + tree + " }" ;
    }

}
