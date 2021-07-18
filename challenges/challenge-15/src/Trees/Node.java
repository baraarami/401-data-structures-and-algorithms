package Trees;

public class Node<T> {
    public T value;
    public Node<T> left;
    public Node<T> right;


    public Node(T value){
        this.value=value;
    }


    @Override
    public String toString(){
        return "Node ( " + "Value = "+value+ " , left" + left +", right" + right+ " )";
    }
}
