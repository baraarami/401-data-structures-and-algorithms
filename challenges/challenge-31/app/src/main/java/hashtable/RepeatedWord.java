package hashtable;

public class RepeatedWord {
    public static  String repetedWord(String string){
        String[] word = String.toLowerCase().split("[,?.@:;!]+");
        Hashtable hashTable = new Hashtable();
        for (int i=0 ; i < word.length ; i++){
            if (!hashTable.contains(word[i])){
                hashTable.add(word[i] , word[i]);
            }else {
                return word[i];
            }
        }
        return " no repeted words" ;
    }
}
