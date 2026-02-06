import java.util.Scanner;

class Salarycalc
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter basic Salary");
		double basic_sal = sc.nextDouble();
		double hra = 0, da = 0;
		if(basic_sal >= 30000)
		{
			hra = 0.2 * basic_sal;
			da = 0.15 * basic_sal;
		}
		else
		{
			hra = 0.1 * basic_sal;
			da = 0.08 * basic_sal;
		}
		double pf = .12 * basic_sal;
		double net_sal = basic_sal + hra + da - pf;
		System.out.println("Net Salary : " + net_sal);
		sc.close();
	}
}
