package java.K.ary;

import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static KaryTree<String> fizzBuzzTree(KaryTree<Integer> kTree){
        KaryTree<String> outTree = new KaryTree<>(kTree.K);

        Queue<Node> queue = new LinkedList<>();
        if (kTree.isNotEmpty()){
            queue.add(kTree.root);
            while (!queue.isEmpty()){
                Node<Integer> currentNode = queue .poll();
                String currentValue ;

                if (currentNode.value % 3 == 0 && currentNode.value % 5 == 0 )
                    currentValue= "FizzBuzz";
                else if ((int)currentNode.value % 3 == 0 )
                    currentValue= "Fizz";
                else if ((int)currentNode.value % 5 == 0)
                    currentValue= "Buzz";
                else
                    currentValue= currentNode.value.toString();
                outTree.add(currentValue);

                if (!currentNode.child.isEmpty())
                    queue.addAll(currentNode.child);
            }
        }
        return outTree;
    }

    public String getGreeting(){
        return " Hello bebo";
    }

    public static void main(String[] args) {
        KaryTree<Integer> tree = new KaryTree<>(3);
        Node<Integer> node = new Node<>(15);
        tree.root=node;
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        System.out.println(tree);
        System.out.println(fizzBuzzTree(tree));
    }


}
