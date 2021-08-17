package hashtable;

import linkedList.LinkedList;
import linkedList.Node;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Hashtable <T>{
    private Object[] hashNodeList = new Object[1024];

    public Hashtable(){

    }


    public Hashtable (Object[] hashNodeList){
        this.hashNodeList=hashNodeList;
    }


    public Object[] getHashNodeList() {
        return hashNodeList;
    }

    public void setHashNodeList(Object[] hashNodeList) {
        this.hashNodeList = hashNodeList;
    }

    int hashFun (char c){
        return (c);
    }

    public int hash (T S){
        int hashCharSum = 0;
        String convertedString = S.toString();
        for (int i=0 ; i < convertedString .length() ; i++){
            int index = hashFun(convertedString.charAt(i));
            hashCharSum+= index;
        }
        return hashCharSum * 599 % 1024;

    }

    public void add (T key , T value){
        int index = hash(key);
        NodeHT newNode = new NodeHT(key,value);
        LinkedList linkedList = new LinkedList();
        if (hashNodeList[index] != null){
            linkedList = (LinkedList) hashNodeList[index];
        }
        linkedList.append((T) newNode);
        hashNodeList[index] = (T) linkedList;
    }

    public T get(T key){
        int index = hash(key);
        if (hashNodeList[index] != null){
            LinkedList linkedList = (LinkedList) hashNodeList[index];
            Node current = linkedList.head;

            while (current != null){
                if (((NodeHT)current.val).getKey() == key){
                    return (T) ((NodeHT) current.val).getValue();
                }
                current=current.next;
            }
        }
        return null;
    }

    public boolean contains(T key){
        int index = hash(key);
        if (hashNodeList[index] != null){
            LinkedList linkedList= (LinkedList) hashNodeList[index];
            Node current = linkedList.head;

            while (current != null){
                if (((NodeHT) current.val).getKey() == key){
                    return true;
                }
                current =current.next;
            }
        }
        return false;
    }


    @Override
    public String toString(){
        return "Hash Table { "+ " Hash List = " + Arrays.toString(hashNodeList)+ " } ";
    }

//    @Override
//    public boolean equals(Object o){
//        if (this == o)
//            return  true;
//        if (o == null || getClass() != o.getClass())
//            return false;
//
//        Hashtable<?> hashtable = (Hashtable<?>) o ;
//        return Arrays.equals(hashNodeList , hashtable.hashNodeList);
//    }

//    @Override
//    public int hashCode(){
//        return Array.hashCode(hashNodeList);
//    }

    public String value(T key){
        int index = hash(key);
        Object value;
        if (hashNodeList[index] != null){
            LinkedList linkedList = (LinkedList) hashNodeList[index];
            Node current = linkedList.head;
            while (current != null){
                if (((NodeHT) current.val).getKey()==key){
                    return (String) ((NodeHT<?>) current.val).getValue();
                }
                current=current.next;
            }
        }
        return "Null";
    }
}
