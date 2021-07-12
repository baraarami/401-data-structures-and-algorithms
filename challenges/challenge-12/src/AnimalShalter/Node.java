package AnimalShalter;

public class Node <T>{
    T value;
    public Node next;


    public Node(T value){
        this.value=value;
    }


    @Override
    public String toString(){
        return "Node { "+ "Animal" + value + " , "+ " next "+ next+ " } ";
    }
}
