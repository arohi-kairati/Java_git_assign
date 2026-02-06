import java.util.Scanner;

class Max {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number.");
        int a = sc.nextInt();

        System.out.println("Enter second number.");
        int b = sc.nextInt();

        int diff = a - b;              // difference
        int k = (diff >> 31) & 1;      // sign bit (1 if a < b, else 0)

        int max = a - k * diff;

        System.out.println("maximum : " + max);

        sc.close();
    }
}
