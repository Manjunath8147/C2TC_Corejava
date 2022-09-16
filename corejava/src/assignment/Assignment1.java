package assignment;
import java.util.Scanner;
public class Assignment1 
 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int time=sc.nextInt();
        if(time<18)
        {
            System.out.println("lights on");
        }
        else if(time<=24&&time>18){
        System.out.println("lights off");    
        }
        
    }
}
