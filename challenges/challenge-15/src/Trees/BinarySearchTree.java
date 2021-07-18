package Trees;

public class BinarySearchTree extends BinaryTree <Object>{

    public void add(Object value){
        Node addNode = new Node(value);
        Node current = this.root;
        try {
            if (this.root == null) {
                this.root = addNode;
            }else {
                while (current != null) {
                    if ((int) current.value > (int) value) {
                        if (current.left == null) {
                            current.left=addNode;
                            break;
                        }
                        current=current.left;
                    }else {
                        if (current.right == null) {
                            current.right=addNode;
                            break;
                        }
                        current = current.right;
                    }
                }
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
    }


    public boolean contains(Object value){
        Node current = this.root;
        try {
            while (current != null){
                if ((int) current.value == (int) value){
                    return true;
                }
                if ((int) current.value > (int) value){
                    current=current.left;
                }else
                    current=current.right;

            }
        }catch (Exception ex){
            System.out.println(ex);
        }
        return false;
    }



    @Override
    public String toString(){
        return "Binary Search Tree ( " + " Root " + root + " , Tree" + tree + " )";
    }



}
