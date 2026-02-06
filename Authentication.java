import java.util.Scanner; 
class Authentication
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int attempt = 0;
		String username = "arohi_k";
		String password = "040605";
		while(attempt < 3)
		{
			System.out.println("Enter username");
			String input_name = sc.nextLine();
			System.out.println("Enter password");
                	String input_pass = sc.nextLine();
			if(input_name.equals(username) && input_pass.equals(password))
			{
				System.out.println("Success! Authenticated!!");
				break;
			}
			else
			{
				attempt++;
				System.out.println("Failed!! you have only "+ (3-attempt)+" chances left");
			}
		}
		sc.close();
	}
}

