package Opps;
class dhirubhai
{
	double maney=1000;
	String lname="ambani";
	
	void thinkingstyle()
	{
		System.out.println("Good..!!");
	}
}
class mukesh extends dhirubhai
{
	double amount=10;
	void details()
	{
		System.out.println(maney+amount);
	}
}
public class p3 
{
	public static void main(String[] args)
	{
		mukesh obj = new mukesh();
		obj.details();
		obj.thinkingstyle();
	}

}
