package LinkedList;

public class Linkedlist {
    public class Node {
        public int value ;
        public Node next ;

        public Node ( int value){
            this.value = value;
        }
    }
Node head = null ; 
public void insert (int value){
    if (this. head == null ){
        head = new Node(value);

    }else {
        Node newNode = new Node(value);
        newNode.next = this.head;
        this.head = newNode;
    }
}


public boolean includes (int value){
    Node currNode = head ;
    while (currNode != null){
        if (currNode.value == value){
            return true;
        }
        currNode = currNode.next;
    } return false;
}
 
@Override 
public String toString(){
    String output = " ";
    Node curreNode = head;
    while (curreNode != null){
        output += " { " + curreNode.value + " } -->";
        curreNode = curreNode.next;
    }
    output+="NULL";
    return output;
}
}
