package AnimalShalter;

import java.util.ArrayList;

public class QueueBrackets {
    public static boolean queueBracket(String str){
         ArrayList<Character> chars = new ArrayList<Character>();
        for(int i=0 ;i <str.length() ; i++){
            if (str.charAt(i) == '{' || str.charAt(i) == '}' || str.charAt(i) == '(' || str.charAt(i) == ')' || str.charAt(i) == '['  || str.charAt(i) == ']'){
                chars.add(str.charAt(i)); }

        }
        System.out.println(chars);
            //if the array is odd return false 
        if (chars.size()==0 || chars.size()%2!=0 || chars.size()==1){
            return false;
        }
        for (int i=0 ; i <chars.size()-1 ; i++){
            char nextTok = chars.get(i+1);
            char c = chars.get(i);
            if (nextTok == '}') {
                if (c == '(' || c == '[') {
                    return false;
                }
            }
        if (nextTok== ')'){
                if (c== '{' || c == '['){
                    return false;
                }
            }
        if (nextTok==']'){
            if (c == '{' || c == '('){
                return false;
            }
        }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("should be False >> null :" + queueBracket(""));
        System.out.println("should be True :" +queueBracket(" {}"));
        System.out.println("should be True :" + queueBracket(" {}(){}"));
        System.out.println("should be True :" + queueBracket("()[[Extra Character]]"));
        System.out.println("should be True :" + queueBracket("(){}[[]]"));
        System.out.println("should be True :"+queueBracket("{}{Code}[Fellows](())"));
        System.out.println("should be False :" + queueBracket("[({}]"));
        System.out.println("should be False :" +queueBracket("(]("));
        System.out.println("should be False :"+queueBracket("{(})"));
    }

}
