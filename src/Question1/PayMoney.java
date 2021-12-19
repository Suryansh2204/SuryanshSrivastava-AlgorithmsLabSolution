package Question1;
import java.util.*;

public class PayMoney 
{	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int size=sc.nextInt();
		int ar[]=new int[size];
		System.out.println("Enter the values of array");
		for(int x=0;x<size;x++)
		{
			ar[x]=sc.nextInt();
		}
		System.out.println("Enter the total no of targets that needs to be achieved");
		int n=sc.nextInt();
		for(int x=1;x<=n;x++)
		{
			System.out.println("Enter the value of target");
			int target=sc.nextInt();
			int sum=0;
			int f=0;
			for(int y=0;y<size;y++)
			{
				sum=sum+ar[y];
				if(sum >= target)
				{
					f=1;
					System.out.println("Target achieved after "+(y+1)+" transactions\n");
					break;
				}
			}
			if(f==0)
				System.out.println("Given target is not achieved\n");
		}
	}
}
