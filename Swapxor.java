import java.util.Scanner;

class Swapxor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of a.");
        int a = sc.nextInt();

        System.out.println("Enter value of b.");
        int b = sc.nextInt();

        // XOR swap
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        sc.close();
    }
}
