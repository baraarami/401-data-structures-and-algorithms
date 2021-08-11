public class App extends BinaryTree {

    public static Object findMaxValue (BinaryTree output){
        try {
            if (output.root == null)
                return 0;

        }catch (Exception ex){
            System.out.println(ex);
        }
        return (output.inOrder(output.root).get((output.inOrder(output.root)).size()-1));
    }

    public static void main(String[] args) {

    }
}

