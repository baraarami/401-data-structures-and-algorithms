

public class LinkedList {

    public static void main(String[] args) {
      List linkedList= new List() ;
        linkedList.insert(7);
        System.out.println(linkedList.toString());
        System.out.println(linkedList.includes(7));
        System.out.println(linkedList.includes(8));
        linkedList.insert(8);
        System.out.println(linkedList.toString());
        System.out.println(linkedList.includes(8));
        linkedList.append(5);
        linkedList.append(6);
        linkedList.insertBefore(6,9);
        linkedList.insertAfter(5,2);
        System.out.println("Node of K :" + linkedList.findNodeK(1));
        LinkedList linkedList1= new LinkedList();
        linkedList1.insert(20);
        linkedList1.append(30);
        linkedList1.append(40);

        System.out.println("linkedList1 :"+ linkedList1.toString() );
        zipList(linkedList , linkedList1);
        System.out.println(linkedList.toString());



    }
    public Node head;
    public LinkedList(){
        this.head=null;
    }

    public void insert(int val){
        Node newNode = new Node(val);
        if (head == null){
            head = newNode;
        }else {
            newNode.next=head;
            head = newNode;
        }
    }

    public boolean includes(int val){
        Node current = this.head;
        while (current != null){
            if (current.val == val){
                return true;
            }else {
                current = current.next;
            }
        }
        return false;
    }
    public String toString(){
        Node current = this.head;
        String linkedListValue = " ";
        while (current != null){
            linkedListValue = linkedListValue + "{" + current.val+ "} ->";
            current=current.next;
        }
        return linkedListValue+ "Null";
    }


    public void append(int val){
        Node appendNode = new Node(val);
        Node currentNode = head;
        if(head == null){
            head= appendNode;
        }else {
            while (currentNode.next != null){
                currentNode=currentNode.next;
            }
            currentNode.next=appendNode;
        }
    }

    public void insertBefore(int val , int newVal){
        Node appendNode =new Node(newVal);
        Node currentNode = head;
        if (head != null && head.val ==val){
            appendNode.next = head;
            head= appendNode;
        }else {
            while (currentNode.next != null){
                if (currentNode.next.val ==val){
                    appendNode.next=currentNode.next;
                    currentNode.next=appendNode;
                    break;
                }
                currentNode=currentNode.next;
            }
        }
    }


    public void insertAfter(int val , int newVal){
        Node current = this.head;
        Node newNode = new Node(newVal);
        while (current != null){
            if (current.val == val){
                newNode.next=current.next;
                current.next=newNode;
                break;
            }
            current =current.next;
        }
    }

    public int findNodeK(int k){
        int counter =0;
        int countReverse=0;

        Node current = this.head;
        while (current.next!=null){
            current = current.next;
            counter++;
        }
        System.out.println("counter : "+ counter);
        countReverse = counter-k;
        counter=0;
        current=this.head;
        System.out.println(counter);
        System.out.println(countReverse);
        while (current.next!=null){
            if (countReverse==counter){
                break;
            }
            current= current.next;
            counter++;
        }
        return current.val;
    }

    public static List zipList(List linkedList , LinkedList secondList){
        Node firstCurrent = linkedList.head;
        Node secCurrent = secondList.head;
        Node firstNext;
        Node secNext;

        if (firstCurrent == null){
            return secondList;
        }
        if (secCurrent == null){
            return linkedList;
        }
        while (firstCurrent != null && secCurrent != null){
            firstNext=firstCurrent.next;
            secNext=secCurrent.next;
            firstCurrent.next=secCurrent;
            firstCurrent=firstNext;
            if (firstCurrent == null){
                break;
            }
            secCurrent.next=firstCurrent;
            secCurrent=secNext;
            if (secCurrent == null){
                break;
            }
        }
        return linkedList;
    }
}
