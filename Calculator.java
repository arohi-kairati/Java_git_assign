//Calculator
import java.util.Scanner;
class Calculator
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		double num1 = sc.nextDouble();
		System.out.println("Enter second number");
		double num2 = sc.nextDouble();
		System.out.println("Enter your choice:\n1 for addition\n2 for subtraction\n3 for multiplication\n4 for division\n5 for modulo(remainder)");
		int choice = sc.nextInt();
		double ans = 0;
		switch(choice)
		{
			case 1:
				ans = num1 + num2;
				System.out.println("Sum : "+ ans);
				break;
			case 2:
				ans = num1 - num2;
				System.out.println("Subtraction : " + ans);
				break;
			case 3:
				ans = num1 * num2;
				System.out.println("Product : " + ans);
				break;
			case 4:
				ans = num1 / num2;
                                System.out.println("Division : " + ans);
                                break;
			case 5:
				ans = num1 % num2;
				System.out.println("Remainder : " + ans);
                                break;
			default:
				System.out.println("Invalid choice!");
		}
		sc.close();
	}
}
