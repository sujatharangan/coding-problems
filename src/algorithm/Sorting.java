package algorithm;

public class Sorting {

    public static void main(String[] args) {

        int[] array = {2,10,8,6,7,3};
        printArray(array);
        //printArray(selectionSort(array));
       // printArray(bubbleSort(array));
        printArray(insertionSort(array));
    }


    /**
     * Selection Sort
     * - Find smallest element 1 -> n
     * - Swap first element and smallest element ; This way first element is sorted
     * - Find smallest element from 2 -> n and repeat
     *
     *
     *  O (n2)
     *  Running of the elements is independent on the elements of array
     *  Because you always find the smallest element
     */
    public static int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length ; i++) {
            //Initialize milValueIndex with last sorted element
            int minValueIndex = i;

            //Find index of smallest element from i+1 -> n
            for (int j = i+1 ; j < arr.length ; j++) {
                 if (arr[j] < arr[minValueIndex]) {
                     minValueIndex = j;
                 }
            }
            //swap arr[i] and arr[minValueIndex] ; arr[i] is now in sorted spot.
            int temp = arr[i];
            arr[i] = arr[minValueIndex];
            arr[minValueIndex] = temp;
        }
        return arr;
    }


    /**
     * Bubble Sort
     * - Compare i and i+1 elements and swap it so larger number moves to i+1.
     * - At the end of iteration, largest element will go to nth index and will be sorted
     * - Repeat , this time till n -1 (since nth element is already sorted)
     *
     *
     * Worst Case : O (n2)
     */
    public static int[] bubbleSort(int[] arr) {

        int lastIndex = arr.length;

        while(lastIndex != 0) {
            for(int j = 0 ; j < lastIndex -1 ; j++) {
                if (arr[j] > arr[j+1]) {
                    //swap adjacent elements so that right side element is larger.
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            //keep decrementing since last element is sorted.
            lastIndex = lastIndex -1;
        }
        return arr;
    }

    /**
     * Insertion Sort
     * - Insert each element in its correct place .
     *
     * - For each element , keep checking all previous elements
     * - While previous element is greater than current element , keep moving previous element to right
     * - Insert current element in the correct left off index
     *
     * O(n2)
     * If array is already sorted or almost sorted, its linear.
     */
    public static int[] insertionSort(int[] arr) {

        for (int i = 0; i < arr.length ; i++) {

            int temp = arr[i];
            int j = i -1;

            while (j >= 0 && temp < arr[j]){
                 //Move j to j +1
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        return arr;
    }



    public static void printArray(int[] array) {

        System.out.println("Size = " + array.length );

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
