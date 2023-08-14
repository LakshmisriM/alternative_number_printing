# alternative_number_printing
Alternative_number_pattern_printing
import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number of rows : ");
	    int x,y;
	    int n=sc.nextInt();
	    for(int i=1;i<=n;i++)
	    {
	        if(i%2==0)
	        {
	            x=1;
	            y=0;
	        }
	        else
	        {
	            x=0;
	            y=1;
	        }
	        for(int j=1;j<=n;j++)
	        {
	            if(j % 2 == 0)
	            {
	                System.out.print(x);
	            }
	            else
	            {
	                System.out.print(y);
	            }
	        }
	        System.out.println("");
	    }
	    
	}
}


