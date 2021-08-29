package Aagrams;


import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String x= "Software";
        String y="Swear often";

        x= x.replace(" " , "");
        y= y.replace(" " , "");

        x = x.toLowerCase();
        y= y.toLowerCase();

        char a [] = x.toCharArray();
        char b [] = y.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        Boolean result = Arrays.equals(a , b);
        if (result == true){
            System.out.println(true);
        }else{
            System.out.println(false);
        }



    }
}
