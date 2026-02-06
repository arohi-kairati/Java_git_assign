//to check if the number is a power of 2
import java.util.Scanner;

class Powerof2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number.");
        int n = sc.nextInt();

        boolean result = (n > 0) && ((n & (n - 1)) == 0);

        System.out.println(result);

        sc.close();
    }
}
