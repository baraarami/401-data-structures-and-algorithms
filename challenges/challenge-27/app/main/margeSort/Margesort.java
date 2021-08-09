package margeSort;

import java.util.Arrays;

public class Margesort {
    public static void main(String[] args) {
        int [] arr = {8,4,23,42,16,15};
        margeSort (arr);
        for (int i=0 ; i < arr.length ; i++){
            System.out.print(" " + arr[i]);
        }
    }

    private static int[] margeSort(int[] arr) {
        int n = arr.length;
        if (n > 1){
            int mid = n/2;
            int [] left = Arrays.copyOfRange(arr , 0 , mid);
            int [] right = Arrays.copyOfRange(arr , mid , arr.length);
            margeSort(left);
            margeSort(right);
            marge(left , right , arr);
        }
        return arr;
    }

    private static int[] marge(int[] left, int[] right, int[] arr) {
    int i =0;
    int j =0 ;
     int k =0;
     while (i < left.length && j < right.length){
         if (left[i] <= right[j]){
             arr[k] = left[i];
              i = i +1;
         }
         else {
             arr[k] = right [j];
             j = j + 1;
         }
         k = k + 1;
     }
    if (i == left.length){
        for (int rem = j ; rem < right.length ; rem++){
            arr[k] = right[rem];
            k++;
        }
    }else {
        for (int rem = i ; rem < left.length ; rem++ ){
            arr[k] = left[rem];
            k++;
        }
    }
    return arr;
    }

}
