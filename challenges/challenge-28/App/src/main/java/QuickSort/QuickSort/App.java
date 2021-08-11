package QuickSort;

public class App {

    public static void main(String[] args) {
        int[] arr = {8,4,23,42,16,15};
        System.out.println(" before : ");
        for (int i=0 ; i <arr.length ; i++){
            System.out.println(arr[i] + " , ");
        }
        QuickSort(arr , 0 , arr.length-1);
        System.out.println("\n after : ");

        for (int i=0 ; i < arr.length ; i++){
            System.out.println(arr[i] + " , ");
        }
    }

    private static int[] QuickSort(int[] arr, int left, int right) {
    if (left < right){
        int position = position(arr , left , right);
        QuickSort(arr , left , position- 1);
        QuickSort(arr , position +1 , right);

    }
    return arr;

    }

    private static int position(int[] arr, int left, int right) {
        int pivot = arr[right];

        int low = left -1;
        for (int i=left ; i < right ;i ++){
            if (arr[i] <= pivot){
                low++;
                Swap(arr , i ,low);
            }
        }
        Swap(arr , right , low + 1);
        return low + 1 ;
    }

    private static void Swap(int[] arr, int i, int low) {
        int temp;
        temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;
    }

}
