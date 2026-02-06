//Division without '/' operator
import java.util.Scanner;

class Divbit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the dividend.");
        int dividend = sc.nextInt();

        System.out.println("Enter the divisor.");
        int divisor = sc.nextInt();
        sc.close();

        if (divisor == 0) {
            System.out.println("Division by zero not allowed.");
            return;
        }

        int quotient = 0;

        // simple repeated subtraction
        while (dividend >= divisor) {
            dividend = dividend - divisor;
            quotient++;
        }

        System.out.println("quotient : " + quotient);
    }
}
