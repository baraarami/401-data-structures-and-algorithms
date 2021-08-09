# Merge Sort
Conceptually, a merge sort works as follows: Divide the unsorted list into n sublists, each containing one element (a list of one element is considered sorted). Repeatedly merge sublists to produce new sorted sublists until there is only one sublist remaining. This will be the sorted list.
## Pseudo Code
```
ALGORITHM Mergesort(arr)
    DECLARE n <-- arr.length

    if n > 1
      DECLARE mid <-- n/2
      DECLARE left <-- arr[0...mid]
      DECLARE right <-- arr[mid...n]
      // sort the left side
      Mergesort(left)
      // sort the right side
      Mergesort(right)
      // merge the sorted left and right sides together
      Merge(left, right, arr)

ALGORITHM Merge(left, right, arr)
    DECLARE i <-- 0
    DECLARE j <-- 0
    DECLARE k <-- 0

    while i < left.length && j < right.length
        if left[i] <= right[j]
            arr[k] <-- left[i]
            i <-- i + 1
        else
            arr[k] <-- right[j]
            j <-- j + 1

        k <-- k + 1

    if i = left.length
       set remaining entries in arr to remaining values in right
    else
       set remaining entries in arr to remaining values in left
```
#
## Trace

### Sample Arrays :
`[8,4,23,42,16,15]`

- Pass 1 :
  - we divide the array to tow sub array : `left` and `right` use the `mergeSort` which tack an array .

- Pass 2 : 
  - when ever the length of the any array is greater than one keep divide it as we do in step one by calling the  `mergeSort`.
- Passes 3 : 
  - once you call the `mergeSort` for the left array will length of one  , stop recursion .
- Passes 4 :
  -  do as the Pass 1.
- Pass 5,6 :
  -  do as the Pass 2.
- Pass 7 :
  -  now when your both of the left and right arrays have length of 1 , you could call `Merge` method which put the less value at first .
- Pass 8 :
  -  tacking the array of step 3 as `left` and as the `right` one for the one that got in step 7 . and keep checking while the both arrays have an elements to merge with the merged array to do the follow :
  - for the both of left and right arrays at the same index check the smaller value between them and put it as that index for the merged array .
- Pass 9 :
   -  once of the one arrays done with adding ets elements to the merged array  `the left one in the example` , add the rest of the other elements in the other array `the right one in the example`from the right to the `merged array` .
   - Done sorted the left side for the main array .

- Pass 10- 19 : 
  - do as the the proceeder as the previous Passes .
- Pass 20 :
  - Now you have the both of the `left` and the `right`  Sorted arrays for the main one , just do as the same of the Pass 9 to got the final sorted array for the passed one .
  
#
![](asssest/CC27.jpg)
#
## Efficency
- Time: `O(nLog(n))`
  - Explanation :
    -  Merge method will take `n` time to merge all the provided elements together.
    -  which called `log n` times to completely merge the array.
- Space: O(1)