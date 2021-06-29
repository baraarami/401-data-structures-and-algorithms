
public class arrayinsertshift{
    public static int [] insertShiftArray (int[] arr , int value ){
        int arrLength = arr.length ;
        int []  newArr = new int [arrLength + 1];
        for ( int i=0 ; i < newArr.length ; i++){
            if (i == (newArr.length/2)){
                newArr [i] = value ;
            }else if( i > (newArr.length/2) - 1 ){
                newArr[i]=arr[i - 1];
            }else{
                newArr[i] = arr[i];
            }
        }
        for ( int i = 0 ; i < newArr.length ; i++){
       System.out.print(newArr[i] + " ");
      
        
        }
         return newArr ;
    }
 public static void main(String[] args) {

        int[] arr1 = { 2, 4, 6, -8 };

        insertShiftArray(arr1, 5);
    }

 }





