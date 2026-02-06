// to calculate the electric bill
import java.util.Scanner;

class Electricbill
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of units");
		int bill = 0;
		int units = sc.nextInt();
		if(units <= 100 && units > 0)
		{
			bill += 100*2;
		}
		else if(units <= 200 && units > 100)
		{
			bill += 100*2;
			units -= 100;
			bill += units;
		}
		else if(units > 200)
		{
			bill += (100*2) + (100*3);
			units -= 200;
			bill += units*5;
		}
		int final_bill = bill + 150;
		System.out.println("Final bil : "+final_bill);
		sc.close();
	}
}

