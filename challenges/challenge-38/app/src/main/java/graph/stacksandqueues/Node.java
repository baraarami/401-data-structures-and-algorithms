package graph.stacksandqueues;

public class Node <T> {
    T value ;
    public Node next;


    public Node(T value){
        this.value=value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }

    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value=value;
    }
}
