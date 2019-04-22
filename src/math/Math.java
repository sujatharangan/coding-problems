package math;


public class Math {


    public static void main(String args[]) {
        int gcdValue = gcd(54, 24);
        System.out.println(gcdValue);
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


}
