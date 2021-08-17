package TreeIntersection;

public class BinarySearchTree extends BinaryTree{
    public void add(Object value){
        NodeTree addNode = new NodeTree(value);
        NodeTree current = this.root;

        try{
            if (this.root== null){
                this.root = addNode;
            }else{
                while (current != null){
                    if ((int) current.value > (int) value){
                        if (current.left == null){
                            current.left = addNode;
                            break;
                        }
                        current=current.left;
                    }else {
                        if (current.right == null){
                            current.right = addNode;
                            break;
                        }
                        current=current.right;
                    }
                }
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
    }


    @Override
    public String toString(){
        return "Binary Search Tree { " + " root = " + root + " , tree " + tree + " }";
    }


    public boolean contains(Object value)
    {
        NodeTree current = this.root;
        try {
            while (current != null ){
                if ((int) current.value == (int) value){
                    return  true;
                }
                if ((int) current.value > (int ) value){
                    current= current.left;
                }else
                    current=current.right;

            }
        }catch (Exception ex){
            System.out.println(ex);
        }
        return false;
    }




}
