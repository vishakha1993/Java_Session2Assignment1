import java.util.Scanner;

public class Vote_check
{
	public static void main(String arg[])
	{
		int age;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter age : ");
		age=scan.nextInt();
		
		if(age>=18)
		{
			System.out.println("You are eligible to vote");
		}
		else
		{
			System.out.println("You are not eligible to vote");
		}
		
	}

}
