package java.K.ary;

import java.util.ArrayList;
import java.util.List;

public class Node <T>{
    T value ;
    public List<Node> child = new ArrayList<>();

    public Node(T value){
        this.value=value;
    }


    public List<Node> getChild(){
        return child;
    }

    public void addChild(Node child){
        this.child.add(child);
    }

    @Override
    public String toString (){
        StringBuilder result = new StringBuilder("{ value = ");
        result.append(value);
        result.append("\n child: [ ");
        for (Node ch : child){
            result.append("\n child :");
            result.append(ch);
        }
        result.append(" ] ");
        return result.toString();
    }

}
