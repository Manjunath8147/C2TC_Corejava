package assignment;
import java.util.Scanner;
public class Assignment4 
{
	public static void main(String[] args) 
	{
Scanner sc=new Scanner(System.in);
int temperature=sc.nextInt();;
int week=5;
for(int i=1;i<week;i++) 
{
	temperature=temperature-2;
	System.out.println(temperature);
}

	}

}
