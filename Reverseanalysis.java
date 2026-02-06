//reverse, no.of digits and sum of digits of a number
import java.util.Scanner;

class Reverseanalysis
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int rem = 0, rev = 0, sum = 0, count = 0;
		while(num > 0)
		{
			rem = num % 10;
			rev = rev*10 + rem;
			sum += rem;
			count++;
			num /= 10;
		}
		System.out.println("Reverse : "+rev);
		System.out.println("Sum of digits of the number : "+sum);
		System.out.println("Count of digits : "+count);
		sc.close();
	}
}

