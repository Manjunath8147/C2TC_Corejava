package assignment;
import java.util.Scanner;
public class Assignment8 
{
public static void main(String[] args) 
{
	
      Scanner sc=new Scanner(System.in);
      int number =sc.nextInt();
      if(number>0) 
      {
    	  System.out.println("Number is positive:"+number);
      }
      if(number<0) 
      {
    	  System.out.println("Number is negative:"+number);
      }
      else if(number==0)
      {
    	 System.out.println("Number is zero:"+number);
      }

}

}
