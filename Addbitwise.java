//Addition without +
import java.util.Scanner;

class Addbitwise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number.");
        int a = sc.nextInt();
        System.out.println("Enter the first number.");
        int b = sc.nextInt();

        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }

        System.out.println("sum : "+a);
        sc.close();
    }
}
