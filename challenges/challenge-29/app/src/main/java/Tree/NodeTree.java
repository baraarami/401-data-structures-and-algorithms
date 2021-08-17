package TreeIntersection;

public class NodeTree <T>{
    public T value ;
    public NodeTree<T> left ;
    public  NodeTree<T> right;

    public NodeTree(){

    }

    public NodeTree (T value){
        this.value=value;
    }

    @Override
    public String toString (){
        return "Node Tree { " + " Value " + value +
                " , left " + left + " , right " + right + " } ";
    }
}
