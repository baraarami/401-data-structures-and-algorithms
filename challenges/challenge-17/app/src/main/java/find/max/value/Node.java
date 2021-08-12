package find.max.value;

public class Node <T>{

    public T value ;
    public Node<T> left ;
    public Node<T> right ;

    public Node(){

    }

    public Node(T value){
        this.value=value;
    }

    @Override
    public String toString (){
        return "Node { " + " value = " + value + " , left " + left + " , right " + " } ";

    }
}
