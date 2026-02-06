// multiplying the number by 7 without using *
import java.util.Scanner;

class Multby7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number.");
        int n = sc.nextInt();

        // n * 7 = (n << 3) - n
        int result = (n << 3) - n;

        System.out.println("result : " + result);

        sc.close();
    }
}
