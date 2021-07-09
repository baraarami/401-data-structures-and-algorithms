

public class LinkedList<T> {
    private Node<T> head ;
    private int size ;

    public void add (T data){
        Node<T> node = new Node<>(data);
        if (head == null){
            head = node;
            return;
        }
        Node<T> current = head;
        while (current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(node);
        size++;
    }
    public void insert (T data){
        Node<T> node = new Node<>(data);
        if(head == null){
            head = node;
        }else{
            Node<T> current = head;
            while(current.getNext() !=null){
                current= current.getNext();
            }
            current.setNext(node);
        }
        size++;
    }

    public void append (T data){
        Node<T> node = new Node<>(data);
        if (head == null) {
            head = node;
        }else{
            Node<T> current = head;
            while (current.getNext() != null){
                current= current.getNext();
            }
            current.setNext(node);
        }
        size++;
    }

    public void insertAfter (T after , T data){
        boolean isIncludes = includes(after);
        if(isIncludes){
            Node<T> newNode = new Node<>(data);
            Node<T> current = head;
            Node<T> afterCurrent = current;
            while (current.getData() != after){
                current= afterCurrent;
                afterCurrent = afterCurrent.getNext();
            }
            newNode.setNext(afterCurrent);
            current.setNext(newNode);
            size++;
        }
    }
    public void insertBefore(T before , T data){
        boolean isIncludes = includes(before);

        if (isIncludes){
            Node<T> newNode = new Node<>(data);
            Node<T> current = head;
            Node<T> prenCurrent = current;
            if (this.head.getData() == before){
                insertAtFirst(data);
            }else{
                while (current.getData() != before){
                    prenCurrent = current;
                    current = current.getNext();
                }
                newNode.setNext(current);
                prenCurrent.setNext(newNode);
                size++;
            }
        }
    }

    public void insertAtFirst(T value){
        Node<T> node = new Node<T>(value);
        if (this.head == null){
            this.head = node;
        }else{
            node.setNext(this.head);
            this.head = node;
        }
        size++;
    }

    public boolean includes(T value){
        Node<T> current = head;
        if(size != 0){
            while (current != null){
                if(current.getData() == value){
                    return true;
                }
                current= current.getNext();
            }
        }return false;
    }

    public T kthFromEnd (int index){
        if ((index > -1) && (index > size)){
            return null;
        }
        if (index > -1){
            Node<T> current = head ;
            int i = size - index;
            while(i >0){
                current = current.getNext();
                i--;
            }
            return current.getData();
        }else{
            return null;
        }
    }


public LinkedList<T> zipList(LinkedList<T> listOne , LinkedList<T> ListTow){
    if(listOne.head != null && ListTow .head != null){
        listOne.head = zipListInsert(listOne.head, ListTow.head);
        return listOne;
    }else{
        return null;
    }
}

private Node<T> zipListInsert (Node<T> nodeOne , Node<T> nodeTow){
    if (nodeOne == null){
        return nodeTow;
    }else if(nodeTow == null){
        return nodeOne;
    }else {
        Node<T> mergeNode = zipListInsert(nodeOne.getNext(), nodeTow.getNext());
        nodeTow.setNext(mergeNode);
        nodeOne.setNext(nodeTow);
        return nodeOne;
    }
}

public boolean palindrom(){
    boolean result ;

    Node<T> printFirst = head;
    Node<T> printSecond = head;
    Node<T> previousPrinter = head ;
    Node<T> middleNode = null;

    if (head != null && head.getNext() != null){
        while (printSecond != null && printSecond.getNext() != null){
            printSecond = printSecond.getNext().getNext();
            previousPrinter = printFirst;
            printFirst = printFirst.getNext();
        }
        if(printSecond != null){
            middleNode = printFirst;
            printFirst = printFirst.getNext();
        }
        Node<T> secHalf = printFirst;
        previousPrinter.setNext(null);

        result = comparison(head , secHalf);

        if (middleNode != null){
            previousPrinter.setNext(middleNode);
            middleNode.setNext(secHalf);
        }else{
            previousPrinter.setNext(secHalf);
        }
    }else{
        result=true;
    }
    return result;
}
private boolean comparison(Node<T> NodeOne, Node<T> NodeTow) {
    Node<T> temoNodeOne = NodeOne;
    Node<T> temoNodeTow = NodeTow;

    while(temoNodeOne != null && temoNodeTow != null){
        if(temoNodeOne.getData() == temoNodeTow.getData()){
            temoNodeOne= temoNodeOne.getNext();
            temoNodeTow =temoNodeTow.getNext();
        }else{
            return false;
        }
    }
    return temoNodeOne == null && temoNodeTow ==null;
}

}
