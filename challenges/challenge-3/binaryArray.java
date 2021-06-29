    public class binaryArray {
    public static int binarySearch(int[] arr , int key){
        int indexOfKeyElement = -1;
        int firstElementIndex =0 ;
        int lastElementIndex = arr.length -1 ;
        int middleElementIndex = (firstElementIndex + lastElementIndex) /2 ;
        while (firstElementIndex < lastElementIndex){
            if(arr[middleElementIndex] < key){
                firstElementIndex = middleElementIndex +1 ;
            }else if (arr[middleElementIndex] == key){
                indexOfKeyElement = middleElementIndex +1;
                break;
            }else {
                lastElementIndex = middleElementIndex -1 ;
            }
            middleElementIndex =(firstElementIndex + lastElementIndex)/2;
        }
        return indexOfKeyElement;
    }
    public static void main(String[] args){
        int[] arr = {11, 22, 33, 44, 55, 66, 77};
        int key = 77 ;

        testBinarySearch();
    }
    public static void testBinarySearch(){
        int[] testArr= {1, 2, 3, 5, 6, 7};
        int keyTest=22;
        int notFoundKeyTest = 88;
        System.out.println("The Expected Found index :" + 1 + " , The Actual index is :" + binarySearch(testArr,keyTest));
        System.out.println("The Expected Unfound index :" +-1+" , The Actual index is : " + binarySearch(testArr , notFoundKeyTest));
    }
}
