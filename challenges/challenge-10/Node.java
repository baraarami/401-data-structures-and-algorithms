


    public class Node<T>{  // node class that have a  properties for the value stored in the Node

        public T value;
        public Node <T> next; // a pointer to the next node.

        public Node (int value2){
            this.value=value2;
        }

        @Override
        public String toString(){
            return  " Node { "+ " value = " + value + " , next = " + next + " }";
        }
    }

