// multiplication without using * operator
import java.util.Scanner;

class Multbit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number.");
        int a = sc.nextInt();

        System.out.println("Enter the second number.");
        int b = sc.nextInt();

        // Handle sign
        boolean negative = false;
        if (a < 0) {
            a = ~a + 1;   // two's complement
            negative = !negative;
        }
        if (b < 0) {
            b = ~b + 1;   // two's complement
            negative = !negative;
        }

        int result = 0;

        while (b != 0) {
            if ((b & 1) == 1) {
                // result = result + a (bitwise addition)
                int x = result;
                int y = a;
                while (y != 0) {
                    int carry = x & y;
                    x = x ^ y;
                    y = carry << 1;
                }
                result = x;
            }
            a <<= 1;
            b >>= 1;
        }

        // Apply sign
        if (negative) {
            result = ~result + 1;
        }

        System.out.println("product : " + result);

        sc.close();
    }
}
