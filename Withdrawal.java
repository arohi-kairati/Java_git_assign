//Withdrawal success of failure
import java.util.Scanner;

class Withdrawal
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account balance");
		double acc_bal = sc.nextDouble();
		System.out.println("Enter withdrawal amount");
		int withdrawal = sc.nextInt();
		if(withdrawal % 100 == 0 && (acc_bal - withdrawal >= 1000))
		{
			System.out.println("Success");
		}
		else
		{
			System.out.println("Failure");
		}
		sc.close();
	}
}

