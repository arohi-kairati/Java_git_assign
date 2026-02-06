//to find all prime numbers between two numbers
import java.util.Scanner;
class Primerange
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("Enter initial number of the range");
		int initial = sc.nextInt();
		System.out.println("Enter final number of the range");
		int fin = sc.nextInt();
		System.out.println("All prime numbers between "+initial+" and "+fin+" are:");
		for(int i = initial; i <= fin; i++)
		{
			for(int j = 1; j <= i/2; j++)
			{
				if(i % j == 0)
				{
					count++;
				}
			}
			if(count == 1)
			{
				System.out.print(i+" ");
			}
			count = 0;
		}
		System.out.println();
		sc.close();
	}
}

