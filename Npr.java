package npr;
import java.util.Scanner;
public class Npr {
	
		double fact(double n)
		{
		   int i=1;
	             	    double fact=1;
		    while(i<=n)
		    {
		   	   fact=fact*i;
			   i++;
	 	    }
	  	      return fact;
		}
		double permutation(int n,int r )
		{
			double per=fact(n)/fact(n-r);	
			return per;
		}
		double permutation1(int n1,int r1)
		{
			double per=fact(n1)/fact(n1-r1);	
			return per;
		}
		
		public static void main(String arg[])	
		{
			 Npr p=new  Npr( );
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of test cases:");
			int T=sc.nextInt();
			System.out.println("enter value of n");
	               	int n=sc.nextInt();
			System.out.println("enter value of r");
	              		int r=sc.nextInt();
	        System.out.println("enter value of n1");
		               	int n1=sc.nextInt();
			System.out.println("enter value of r1");
		              		int r1=sc.nextInt();     		
			if(n>=r)
			{
			System.out.println("The value of "+n+"p"+r+" is : "+p.permutation(n,r));	
			System.out.println("The value of "+n1+"p"+r1+" is : "+p.permutation1(n1,r1));	
			}
			
			
			
		}	
	
}
