package Question2;
import java.util.*;

public class CurrencyDenomination 
{
	public static void sortDsc(int ar[])
	{
		for(int x=0;x<ar.length-1;x++)
		{
			int max=ar[x];
			int i=x;
			for(int y=x+1;y<ar.length;y++)
			{
				if(ar[y]>max)
				{
					max=ar[y];
					i=y;
				}
			}
			int temp=ar[x];
			ar[x]=ar[i];
			ar[i]=temp;
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		int size=sc.nextInt();
		int currency[]=new int[size];
		System.out.println("\nEnter the currency denominations value");
		for(int x=0;x<size;x++)
		{
			currency[x]=sc.nextInt();
		}
		sortDsc(currency);
		System.out.println("\nEnter the amount you want to pay");
		int amt=sc.nextInt();
		int temp=amt;
		int i=0;
		System.out.println("\nYour payment approach in order to give min no of notes will be");
		while(amt>0 && i<currency.length)
		{
			int d=temp/currency[i];
			if(d>0)
			{
				temp%=currency[i];
				System.out.println(currency[i]+":"+d);
			}
			i++;
		}
	}
}
