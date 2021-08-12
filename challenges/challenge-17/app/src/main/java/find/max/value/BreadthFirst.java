package find.max.value;

import java.util.ArrayList;

public class BreadthFirst extends BinaryTree{
    public BreadthFirst (Object value){}

    public BreadthFirst(){}


    public static ArrayList breadthFirst(BreadthFirst input){
        ArrayList output = new ArrayList();
        Queue q = new Queue();
        q.enqueue(input.root);
        try {
            if (input.root == null){
                return null;
            }
            while (q.front != null){
                output.add(((Node)q.front.value).value);
                if (((Node) q.front.value).left != null){
                    q.enqueue(((Node)q.front.value).left);
                }
                q.dequeue();
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
        return output;
    }
}
