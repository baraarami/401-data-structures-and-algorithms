package LeftJoin;

import hashtable.Hashtable;

public class LeftJoin {
    public static void main(String[] args) {
        Hashtable left = new Hashtable();
        Hashtable right = new Hashtable();

        left.add("fond" , "enamored");
        left.add("wrath" , "anger");
        left.add("diligent" , "employed");
        left.add("outift" , "garb");
        left.add("guide" , "usher");

        right.add("fond" , "averse");
        right.add("wrath" , "delight");
        right.add("diligent" , "idle");
        right.add("guide" , "follow");
        right.add("flow" , "jam");


        System.out.println(left.get("fond"));
        System.out.println(left.value("fond"));

        System.out.println(right.hash("flow"));
        System.out.println(left.getHashNodeList()[263]);
        System.out.println(left.getHashNodeList().length);
        System.out.println(left.getHashNodeList()[263]);
        System.out.println(right.get(left.get("diligent")));
        System.out.println(left.hash("fond"));
        System.out.println(left.contains("fond"));
        System.out.println(right.get(left.getHashNodeList()[933]));
        System.out.println(left);

    }

    public static Hashtable leftJoin(Hashtable left , Hashtable right){
        Hashtable output = new Hashtable();
        String[] value ;
        if (left.getHashNodeList().length>0){
            for (int i =0 ; i <left.getHashNodeList().length ; i++){
                output.add(left.getHashNodeList()[i] , left.getHashNodeList()[i]);
                if (right.contains(left.get(right.get(left.getHashNodeList()[i])))){
                    output.add(left.getHashNodeList()[i] , right.get(left.getHashNodeList()[i]));
                }else {
                    output.add(left.getHashNodeList()[i] , "NULL");
                }
            }
        }
        return output;
    }
}
