package math;


import java.util.ArrayList;
import java.util.List;

public class Math {


    public static void main(String args[]) {
      //  int gcdValue = gcd(54, 24);
      //  System.out.println(gcdValue);
       // System.out.println(pascalsTriangle(5));
        System.out.println(factorial(1));
    }

    /*
    Recursive function to get GCD using Euclid's Algorithm

    If remainder is zero, quotient is GCD.
    Else -> Divisor becomes Divident and Remainder becomes Divisor;

     */
    public static int gcd(int x , int y) {
        int quotient = x / y;
        int remainder = x % y;

        System.out.println(x + " " + y + " " + quotient + " " + remainder);

        if (remainder == 0) {
            return y;
        } else {
            return gcd(y, remainder);
        }
    }



    /*
    Factorial(n) = n * (n-1) * (n-2) ... *1
     */
    public static int factorial(int num) {

        int fact = num;
        if (num != 1) {
            fact = fact * factorial(num - 1);
        }
        return fact;
    }

    /**
     * Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
     * In Pascal's triangle, each number is the sum of the two numbers directly above it.
     * Sample output for numRows=5
     * [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]
     *
     *     [1],
     *    [1,1],
     *   [1,2,1],
     *  [1,3,3,1],
     * [1,4,6,4,1]
     * @param numRows
     * @return
     */
    public static List<List<Integer>> pascalsTriangle(int numRows) {
        List<List<Integer>> pascalsTrig = new ArrayList<List<Integer>>();

        for (int i = 0; i < numRows; i++) {

            List<Integer> pascalsTriangleRow = new ArrayList<Integer>();

            for (int j =0 ; j <= i; j++ ){

                //First and last elements are always 1
                 if (j == 0 || j == i) {
                     pascalsTriangleRow.add(1);
                 } else {
                     //Get previous list and add the two indexes to left.
                     List<Integer> previous = pascalsTrig.get(i-1);
                     pascalsTriangleRow.add(previous.get(j) + previous.get(j-1));
                 }
            }
            pascalsTrig.add(pascalsTriangleRow);
        }
        return  pascalsTrig;
    }

    // Check if number is self dividing by each digit
    // Self diving if each digit is non-zero and divides the number. For example, with 128 is self diving coz 128 is divisble by 1 , 2 and 8
    //LC # 728
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> selfDivNumList = new ArrayList<Integer>();

        for(int i = left ; i <=right ; i++) {

            if( isNumSelfDividing(i)) {
                selfDivNumList.add(i);
            }
        }
        return selfDivNumList;
    }

    //Note : DIviding and Mod of 10 gets digits of the number
    public static boolean isNumSelfDividing(int num){
        int x = num;
        int y = num;
        while ( x!= 0 && y!= 0){
            y = x % 10;
            x = x / 10;
            if (y == 0){
                return false;
            }
            if( num % y != 0){
                return false;
            }
        }
        return true;
    }


}
