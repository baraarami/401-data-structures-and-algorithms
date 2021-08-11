# 401-data-structures-and-algorithms

# Quicksort
Quicksort : is a divide-and-conquer algorithm. It works by selecting a 'pivot' element from the array and partitioning the other elements into two sub-arrays, according to whether they are less than or greater than the pivot. For this reason, it is sometimes called partition-exchange sort.

Pseudocode
SelectionSort(int[] arr)
    DECLARE n <-- arr.Length;
    FOR i = 0; i to n - 1  
        DECLARE min <-- i;
        FOR j = i + 1 to n
            if (arr[j] < arr[min])
                min <-- j;

        DECLARE temp <-- arr[min];
        arr[min] <-- arr[i];
        arr[i] <-- temp;
        
        
        
  ![CC28](https://user-images.githubusercontent.com/79080942/129092232-ddc99448-c9d3-4b88-b935-bded34dc48a3.png)
        
        
        
        
        
        
  Big O :
  - Time: O(n^2)
  - Space: O(1)

   


