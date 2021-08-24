package linkedList;

public class LinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

    }

    public Node head;
    public LinkedList(){
        this.head=null;
    }

    public void insert(int val){
        Node newNode = new Node(val);
        if (head != null) {
            newNode.next = head;
        }
        head=newNode;

    }


    public String toString(){
        Node current = this.head;
        String linkedListValue = " ";
        while (current != null){
            linkedListValue = linkedListValue + " { " + current.val + " }--> ";
            current=current.next;
        }
        return linkedListValue+" Null ";

    }

    public void append(Object val){
        Node appendNode = new Node(val);
        Node currentNode = head;
        if (head == null){
            head = appendNode;
        }else {
            while (currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = appendNode;
        }
    }


    public static LinkedList zipLists(LinkedList firstList , LinkedList secondList){
        Node firstCurrent = firstList.head;
        Node secondCurrent = secondList.head;
        Node firstNext;
        Node secondNext;
        if (firstCurrent == null){
            return secondList;
        }
        if (secondCurrent == null){
            return firstList;
        }

        while (firstCurrent != null && secondCurrent != null){
            firstNext = firstCurrent.next;
            secondNext = secondCurrent.next;
            firstCurrent.next = secondCurrent;
            firstCurrent = firstNext;
            if (firstCurrent == null){
                break;
            }
            secondCurrent.next = firstCurrent;
            secondCurrent = secondNext;
            if (secondCurrent == null){
                break;
            }
        }
        return  firstList;
    }

}
