package graph.graph;

public class Library {
    public boolean someLibraryMethod(){
        return true ;
    }

    public static void main(String[] args) {

    }

    public static void sortArr(int[] arr){
        int tows = 1 , zeros = 0;
        for (int i=0 ; i < arr.length ; i++){
            if (arr[i] == 0){
                arr[i] = arr[zeros];
                arr[zeros] =0 ;
                zeros++;
            }
            if (arr[i] == 2 && arr.length-tows > i){
                arr[i] = arr [arr.length - tows];
                arr[arr.length - tows] = 2;
                i--;
                tows++;
            }
        }
    }

}
