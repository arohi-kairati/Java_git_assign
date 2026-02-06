//subtraction without using - operator
import java.util.Scanner;

class Subbit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number.");
        int a = sc.nextInt();
        System.out.println("Enter the second number.");
        int b = sc.nextInt();

        // two's complement of b → (~b + 1)
        b = ~b;
        int one = 1;
        while (one != 0) {
            int carry = b & one;
            b = b ^ one;
            one = carry << 1;
        }

        // now add a + (-b)
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }

        System.out.println("difference : " + a);
        sc.close();
    }
}
