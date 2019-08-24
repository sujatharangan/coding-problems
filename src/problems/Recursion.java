package problems;

import dstructure.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Sujatha
 */
public class Recursion {

    public static void main(String[] args) {
        //System.out.println(factorial(3));
        //System.out.println(power(3,4));
       // printDescending(20);
       // System.out.println(gcd(54, 24));
       // fibonacci(30);


        int[] nums = {1, 3, 9, 4, 2};
       // printArray(reverse(nums));
       // printArray(mergeSort(nums, 0, nums.length-1));
        //System.out.println(reverseString("This is a String"));
        System.out.println(reverseString2("This is a String".toCharArray()));

    }

    //GCD
    public static int gcd(int divident, int divisor) {
        if (divident  % divisor == 0 ) {
            return divisor;
        }
        return gcd(divisor, divident %divisor);
    }

    //Factorial
    public static int factorial(int num) {
        if (num <= 1) {
            return 1;
        }
        return num * factorial(num-1);
    }

    //Print x ^ y (power)
    public static int power(int x, int y) {
        if (y == 1){
            return x;
        }
        return x * power(x, y-1);
    }

    //Fibonacci 0 1 1 2 3 5 ...
    public static void fibHelper (int x , int y, int max) {
        if (x >= max) {
            return;
        }
        System.out.println (x + " ");
        fibHelper(y, x+ y, max);
    }

    public static void fibonacci(int max){
        fibHelper(0 , 1, max);
    }

    //Print numbers 1..n in descending order
    public static void printDescending(int n) {
        if (n < 1) {
            return;
        }
        System.out.print(n+ " ");
        printDescending(n-1);
    }

    // Tail Recursion using two pointers
    public static int[] reverseHelper(int[] nums, int startIndex, int endIndex) {

        if (startIndex >= endIndex) {
            return nums;
        }
        int temp;
        //swap
        temp = nums[startIndex];
        nums[startIndex] = nums[endIndex];
        nums[endIndex] = temp;

        return reverseHelper(nums, startIndex+1, endIndex-1);
    }

    public static int[] reverse(int[] nums) {
        reverseHelper(nums, 0, nums.length-1);
        return nums;
    }

//    public static int[] reverse2(int[] nums) {
//
//        if (nums.length <= 1) {
//            return nums;
//        }
//
//        return Arrays.asList(nums).add(nums[nums.length-1]) + reverse2(Arrays.copyOfRange(nums, 0, nums.length-1));
//    }



    //Is number a palindrome


    //Reverse a string in O(1) without allocating extra memory
    public static String reverseString(String str) {

        if (str.length() <= 1) {
            return str;
        }
        return str.charAt(str.length()-1) + reverseString(str.substring(0, str.length()-1));
    }

    //Write a function that reverses a string. The input string is given as an array of characters char[].
    public static String reverseString2(char[] chArray) {

        if (chArray.length <= 1) {
            return new String(chArray);
        }

        return chArray[chArray.length-1] + reverseString(String.valueOf(chArray).substring(0, chArray.length-1));
    }

    //Quick Sort


    /**
     * Merge two sorted arrays
     * @param x
     * @param y
     * @return
     */
    public static int[] mergeSortedArrays(int[] x, int[] y) {

        int[] merged = new int[x.length + y.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while( i < x.length && j < y.length) {
            //take smaller element
            if (x[i] <= y[j]) {
                merged[k] =  x[i];
                i++;
            } else {
                merged[k] =  y[j];
                j++;
            }
            k++;
        }
        //copy remaining x and y if any
        while (i < x.length) {
            merged[k] = x[i];
            k++;
            i++;
        }
        while (j < y.length) {
            merged[k] = y[j];
            k++;
            j++;
        }
        return merged;
    }
    //Merge Sort
    public static int[] mergeSort(int[] arr, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return arr;
        }

        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        //copy and create left and right temp arrays
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }

        int[] l = mergeSort(left, 0, mid-1);
        int[] r =mergeSort(right, mid , arr.length-1);

        return mergeSortedArrays(l, r);
    }

    //Pascals triangle

    //Reverse Linked List

    //Tower of Hanoi

    //Decimal to binary


    //Helper print
    public static void printArray(int[] arr) {

        for(int i = 0 ; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
