package assignment;
import java.util.Scanner;
public class Assignment6 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		if(number%3==0) 
		{
			System.out.println("multiple of 3");
			
		}
		else 
		{
			System.out.println("not multiple of 3");
		}

}
}