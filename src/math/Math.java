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


    /*
    Fibonacci sequence = 0,1,1,2,3,5,8,13 ....
    F(0) = 0; F(1) = 1;
    F(N) = F(N-1) + F(N-2) for N > 1
     */
    public static int fibonacci(int N) {
        if(N == 0) {
            return 0;
        }
        if (N ==1){
            return 1;
        }
        return fibonacci(N-1) + fibonacci(N-2);
    }


}
