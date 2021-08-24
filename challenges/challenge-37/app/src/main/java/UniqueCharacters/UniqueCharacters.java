package UniqueCharacters;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class UniqueCharacters {
    public static void main(String[] args) {
        String word = "I love cats";
        char y[] = word.toCharArray();
        int size = y.length;

        Map<Character , Integer> map = new Hashtable<>();
        int i = 0;
        while (i != size){
            if (map.containsKey(y[i]) == false){
                map.put(y[i] , i);
            }
            else {
                int oldVal = map.get(y[i]);
                int newVal = oldVal + 1 ;
                map.put(y[i] , newVal);
            }
            ++i;
        }
        Set<Map.Entry<Character, Integer>> hmap = map.entrySet();
        for (Map.Entry<Character , Integer> data : hmap){
            if (data.getValue() > 1) {
                System.out.println("False");
                System.exit(0);
            }
        }
        System.out.println("True");
    }
}
