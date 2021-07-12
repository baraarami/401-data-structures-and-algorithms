

public class List {
    Node head;

    public static void main(String[] args) {
        List list1 = new List();
        List list2 = new List();

        int[] test1 = {1, 2, 3, 4, 5, 100, 500, 800};
        int[] test2 = {1, 5, 6, 2, 400, 600, 700, 900};

        for (int i = 0; i < test1.length; i++) {
            list1.append(list1[i]);
        }
        for (int i = 0; i < test1.length; i++) {
            list1.append(list2[i]);
        }
        merge(list1, list2);
        System.out.println(list1);
    }

    public static void merge(List list1 , List list2){
        Node current1 = list1.head;
        Node current2 = list2.head;

        Node firstNext , secondNext ;

        while (current1.next != null && current2.next !=null){
            if (current1.next.val >= current1.val){
                firstNext=current2;
                secondNext=current2.next;
                current2.next = current1.next;
                current1.next=current2;
                current2=secondNext;

            }
            current1=current1.next;
        }
        while (current1.next!= null){
            current1=current1.next;
        }
        while (current2!= null){
            current1.next = current2;
            current2= current2.next;
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
    
    public void insert(int i) {
        int val = 0;
        Node newNode = new Node(val);
        if (head == null){
            head = newNode;
        }else {
            newNode.next=head;
            head = newNode;
        }
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
}

