//Smart billing
import java.util.Scanner;
class Smartbill
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter price per one item");
		double item_p = sc.nextInt();
		System.out.println("Enter quantity");
		int quantity = sc.nextInt();
		double total = item_p * quantity;
		double discount = 0;
		if(total >= 2000 && total < 5000)
		{
			discount = (0.05) * total;
		}
		else if(total >= 5000)
		{
			discount = (0.1) * total;
		}
		double new_p = total - discount;
		double gst = (0.18) * new_p;
		//System.out.println(gst);
		double fin_p = new_p + gst;
		System.out.println("Final Price : " + fin_p);
		sc.close();
	}
}
