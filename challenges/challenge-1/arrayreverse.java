  
public class arrayreverse{


        public static void main(String[] args){

                int[] array1 =new int []{1, 2, 3, 4, 5, 6};
                System.out.println( "the original array is :" + " ");

                for(int i=0 ; i < array1.length;i++){

                System.out.print(array1[i] + " ");

                }

                System.out.println();

                System.out.println(" the reversed array is :");

                for(int i=array1.length-1; i>=0 ; i--){

                System.out.print(array1[i] + " ");

}
}
}