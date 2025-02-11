package Oops;

public class p5 
{
	double calculatearea(double radius)
	{
		return Math.PI * radius * radius;
	}
	
	double calculatearea(double length, double breadth)
	{
		return length * breadth;
	}
	double calculatearea( int base, int height)
	{
		return 0.5* base * height; 	
	}
	
	
	public static void main(String[] args) 
	{
		p5 obj = new p5();
		
		System.out.println("area of circle  :"+obj.calculatearea(7));
		System.out.println("area of ractange : "+obj.calculatearea(10, 5));
		System.out.println("area of triangle :"+obj.calculatearea(2, 1));
	}

}
