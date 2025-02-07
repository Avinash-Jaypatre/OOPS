package Oops;

class atm
{
	private double amount;
	
	atm(double amount)
	{
		this.amount=amount;
	}
	
	double get()
	{
		return amount;
	}
}

public class p1 
{
	public static void main(String[] args)
	{
		atm obj = new atm(10000);
		System.out.println(obj.get());
		
	}
}
