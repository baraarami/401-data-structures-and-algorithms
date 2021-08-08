package InsertionSort;

public class Library {
    public static void main(String[] args) {
        int [] array ={8,4,23,42,16,15};
        System.out.println(" before : ");
        for (int i=0 ; i < array.length ; i++){
            System.out.println(array[i]+ " , ");
        }
        InsertionSort(array);
        System.out.println("\n after : ");

        for (int i=0 ; i < array.length ; i++){
            System.out.println(array[i]+ " , ");
        }

    }


    static int[] InsertionSort(int[] arr) {
        for (int i= 1 ; i <arr.length ; i++){
            int j = i - 1;
            int temp = arr[i];

            while (j <0 && temp <arr[j]){
                arr[j + 1] = arr [j];
                j = j - 1;

            }
            arr[j + 1] = temp;
        }
        return arr;
    }
}
