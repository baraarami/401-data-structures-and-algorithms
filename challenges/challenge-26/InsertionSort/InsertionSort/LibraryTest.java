package InsertionSort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTest {

    @Test
    public void testInsertionSort(){
        Library classUnderTest2 = new Library();
        int [] array = {8,4,23,42,16,15};
        int [] sortedArray = {4,8,15,16,23,42};
        classUnderTest2.InsertionSort(array);
        assertArrayEquals(sortedArray , classUnderTest2.InsertionSort(array));

    }

    @Test
    public void testInsertionSize(){
        Library classUnderTest2 = new Library();
        int[] array = {8,4,23,42,16,15};
        assertEquals(array.length , classUnderTest2.InsertionSort(array).length);
    }


    @Test
    public void  testInsertionWithSizeOfOne(){
        Library classUnderTest2 = new Library();
        int[] array = {8};
        assertArrayEquals(array , classUnderTest2.InsertionSort(array));
    }
    private void assertArrayEquals(int[] sortedArray, int[] insertionSort) {
    }
}
