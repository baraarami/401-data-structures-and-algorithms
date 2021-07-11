


    public class Node<T>{  // node class that have a  properties for the value stored in the Node

        T value;
        public Node<T> next; // a pointer to the next node.

        public Node (T value){
            this.value=value;
        }

        @Override
        public String toString(){
            return  " Node { "+ " value = " + value + " , next = " + next + " }";
        }
    }

