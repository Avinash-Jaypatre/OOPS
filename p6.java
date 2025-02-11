package Oops;

	class Calculator
	{

	    double calculate(double a, double b) {
	        return 0;  
	    }
	}


	class Addition extends Calculator 
	{
	    @Override
	    double calculate(double a, double b) {
	        return a + b;
	    }
	}


	class Multiplication extends Calculator 
	{
	    @Override
	    double calculate(double a, double b) {
	        return a * b;
	    }
	}

	
	class Power extends Calculator
	{
	    @Override
	    double calculate(double base, double exponent) 
	    {
	        return Math.pow(base, exponent);
	    }
	}

	
	public class p6 {
	    public static void main(String[] args) 
	    {
	        Calculator add = new Addition();
	        Calculator multiply = new Multiplication();
	        Calculator power = new Power();

	        System.out.println("Addition (5 + 3) = " + add.calculate(5, 3));
	        System.out.println("Multiplication (5 * 3) = " + multiply.calculate(5, 3));
	        System.out.println("Power (5^3) = " + power.calculate(5, 3));
	    }
	}



