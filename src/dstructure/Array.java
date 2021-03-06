package dstructure;

import java.util.ArrayList;
import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        // System.out.println(plusOne(nums));

        int[] nums1 = {1, 3, 9, 4, 2};
        // System.out.println(dominantIndex(nums1));

        int[] nums2 = {1, 0, 7, 3, 6, 5, 6};
        //System.out.println(pivotIndex(nums2));

        //System.out.print(reverse(nums1));
       // System.out.println(reverseUsingRecursion(nums2));

        duplicateZeros(nums2);
        for (int i = 0 ; i < nums2.length; i++) {
            System.out.println(nums2[i]);
        }

    }


    /*
    Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

    The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

    You may assume the integer does not contain any leading zero, except the number 0 itself.

    Example 1:
    Input: [1,2,3]
    Output: [1,2,4]
    Explanation: The array represents the integer 123.

    Example 2:
    Input: [4,3,2,1]
    Output: [4,3,2,2]
    Explanation: The array represents the integer 4321.*/
    public static int[] plusOne(int[] digits) {
        int size = digits.length;
        digits[size - 1] = digits[size - 1] + 1;
        return digits;
    }


    /*
    In a given integer array nums, there is always exactly one largest element.
    Find whether the largest element in the array is at least twice as much as every other number in the array.
    If it is, return the index of the largest element, otherwise return -1.

    Example 1:
    Input: nums = [3, 6, 1, 0]
    Output: 1
    Explanation: 6 is the largest integer, and for every other number in the array x,
    6 is more than twice as big as x.  The index of value 6 is 1, so we return 1.

    Example 2:
    Input: nums = [1, 2, 3, 4]
    Output: -1
    Explanation: 4 isn't at least as big as twice the value of 3, so we return -1.
     */
    public static int dominantIndex(int[] nums) {

        //Clone deep copies the array
        int[] sortedNums = nums.clone();
        //Sort array ; If max is greater than last but one, it is greater than all of them in a sorted array
        Arrays.sort(sortedNums);
        System.out.println(nums);
        if (sortedNums[sortedNums.length - 1] > (2 * sortedNums[sortedNums.length - 2])) {

            int maxValue = sortedNums[sortedNums.length - 1];
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == maxValue) {
                    return i;
                }
            }
            return sortedNums[sortedNums.length - 1];
        } else {
            return -1;
        }
    }

    /*Given an array of integers nums, write a method that returns the "pivot" index of this array.
    We define the pivot index as the index where the sum of the numbers to the left of the index is equal to the sum of the numbers to the right of the index.
    If no such index exists, we should return -1. If there are multiple pivot indexes, you should return the left-most pivot index.

    Example 1:
    Input:
    nums = [1, 7, 3, 6, 5, 6]
    Output: 3
    Explanation:
    The sum of the numbers to the left of index 3 (nums[3] = 6) is equal to the sum of numbers to the right of index 3.
    Also, 3 is the first index where this occurs.

    Example2
    Input:
    nums = [1, 2, 3]
    Output: -1
    Explanation:
    There is no index that satisfies the conditions in the problem statement.
    */

    public static int pivotIndex(int[] nums) {

        int pivotIndex = -1;
        int rhsTotal = 0;
        //Get total
        for (int i = 0; i < nums.length; i++) {
            rhsTotal = rhsTotal + nums[i];
        }
        int lhsTotal = 0;
        //keep traversing keeping track of rhs-total and lhs-total
        for (int i = 0; i < nums.length; i++) {
            rhsTotal = rhsTotal - nums[i];
            if (rhsTotal == lhsTotal) {
                return i;
            }
            lhsTotal = lhsTotal + nums[i];
        }
        return pivotIndex;
    }

    //Two pointers one in start and another from end;
    // TODO incomplete
    public static int pivotIndex2(int[] nums) {

        int pivotIndex = -1;
        int i = 0;
        int j = nums.length;
        int rhsTotal = 0;
        int lhsTotal = 0;

        while (i < j) {
            if (nums[i] < nums[j]) {
                i++;
            } else {
                j++;
            }


        }
        return pivotIndex;
    }

    //Reverse an array using two pointers one in the start and another in the end
    // Keep incrementing the start and decrementing the end and swap.
    // [1, 5, 6,9] -> [9, 6 5,1]

    public static int[] reverse(int[] nums) {
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            int val = nums[i];
            nums[i] = nums[j];
            nums[j] = val;
            i++;
            j--;
        }
        return nums;
    }


    // Tail Recursion using two pointers
    public static int[] reverseUsingRecursion(int[] nums, int startIndex, int endIndex) {

        if (startIndex >= endIndex) {
            return nums;
        }
        int temp;
        //swap
        temp = nums[startIndex];
        nums[startIndex] = nums[endIndex];
        nums[endIndex] = temp;

        return reverseUsingRecursion(nums, startIndex + 1, endIndex - 1);
    }

    public static int[] reverseUsingRecursion(int[] nums) {
        reverseUsingRecursion(nums, 0, nums.length - 1);
        return nums;
    }

//    /*
//    Diagonal traverse a m*n matrix
//     */
//    public int[] findDiagonalOrder(int[][] matrix) {
//        return null;
//    }
//
//    /*
// Spiral traverse a m*n matrix
// */
//    public int[] spiral(int[][] matrix) {
//        return null;
//    }


//
//    /*
//    Pascal's triangle
//    Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
//    In Pascal's triangle, each number is the sum of the two numbers directly above it.
//
//    Input: 5
//Output:
//[
//     [1],
//    [1,1],
//   [1,2,1],
//  [1,3,3,1],
// [1,4,6,4,1]
//]
//     */
//    public List<List<Integer>> generate(int numRows) {
//        return null;
//    }


    //Given a binary array, find the maximum number of consecutive 1s in this array.
    //The input array will only contain 0 and 1.
    public int findMaxConsecutiveOnes(int[] nums) {

        int countMaxOne = 0;
        int currentSeqCount = 0;
        boolean isOneCurrentSeq = false;

        for (int k = 0; k < nums.length; k++) {
            if (nums[k] == 1) {
                currentSeqCount++;
                isOneCurrentSeq = true;
            } else {
                if (isOneCurrentSeq) {
                    //Going from 1 -> 0
                    if (currentSeqCount > countMaxOne) {
                        countMaxOne = currentSeqCount;
                    }
                }
                currentSeqCount = 0;

            }
        }
        if (currentSeqCount > countMaxOne) {
            countMaxOne = currentSeqCount;
        }
        return countMaxOne;
    }


    //Given array of even and odd numbers ; return array of even first followed by odd or odd first followed by even
    //LC : # 905
    public int[] sortArrayByParity(int[] A) {

        if (A.length == 0) {
            return A;
        }

        ArrayList even = new ArrayList();
        ArrayList odd = new ArrayList();

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                even.add(A[i]);
            } else {
                odd.add(A[i]);
            }
        }
        //Add all odd elements to even list
        even.addAll(odd);

        //Convert list to array
        int[] evenOddArr = new int[A.length];

        for (int j = 0; j < even.size(); j++) {
            evenOddArr[j] = (int) even.get(j);
        }
        return evenOddArr;
    }

    //Solution 2 : 1 pass ; create two pointers in result array in beggining and end
    public int[] sortArrayByParity2(int[] A) {
        int evenPointer = 0;
        int oddPointer = A.length - 1;
        int[] sortedArray = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            int val = A[i];
            if (val % 2 == 0) {
                sortedArray[evenPointer] = val;
                evenPointer++;
            } else {
                sortedArray[oddPointer] = val;
                oddPointer--;
            }
        }
        return sortedArray;

            /* Alternative:
            return Arrays.stream(A)
                         .boxed()
                         .sorted((a, b) -> Integer.compare(a%2, b%2))
                         .mapToInt(i -> i)
                         .toArray();
            */
    }

    /**
     * Leet Code problem #1089
     * Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.

    * [1,0,2,3,0,4,5,0] -> [1,0,0,2,3,0,0,4]
     * @param arr
     */
    public static void duplicateZeros(int[] arr) {

        int i = 0;
        while( i < arr.length) {

            if (arr[i] == 0 && (i+1) < arr.length) {
                int temp = arr[i+1];
                arr[i+1] = 0;
                int j = i+2;

                while (j < arr.length) {
                    int temp1 = arr[j];
                    arr[j] = temp;
                    temp = temp1;
                    j++;
                }
                // Ignore the zero we have just replaced.
                i = i +2;
            } else {
                i++;
            }
        }
    }


}
