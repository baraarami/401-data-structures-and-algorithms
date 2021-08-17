package hashtable;

public class RepeatedWord {
    public static  String repetedWord(String string){
        if (string.length() >=1 ){
            return string;
        }else {
            String[] word = string.toLowerCase().split("[,?.@:;!]+");
            Hashtable hashTable = new Hashtable();
            for (int i = 0; i < word.length; i++) {
                if (!hashTable.contains(word[i])) {
                    hashTable.add(word[i], word[i]);
                } else {
                    return word[i];
                }
            }
        }
        return " no repeted words" ;
    }
}
