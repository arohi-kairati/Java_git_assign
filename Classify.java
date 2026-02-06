// check for positive/negative ,even/odd, divisibility by 5 & 7.
import java.util.Scanner;

class Classify
{
        public static void main(String []args)
        {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enetr a number.");
                int num = sc.nextInt();
                if(num >= 0)
                {
                        System.out.println("It is positive");
                }
                else
                {
                        System.out.println("It is negative");
                }
                if(num % 2 == 0)
                {
                        System.out.println("It is even");
                }
                else
                {
                        System.out.println("It is odd");
                }
                if(num % 5 == 0 && num % 7 == 0)
                {
                        System.out.println("It is divisible by both 5 and 7.");
                }
                else
                {
                        System.out.println("It is not divisible by both 5 and 7.");
                }
                sc.close();
        }
}


