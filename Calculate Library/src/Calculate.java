//this class contains the methods to do various math related tasks
//@author Bryan Tam
//version 1 September 16,2018

public class Calculate
{
	//returns the square of an integer
	public static int square(int number) 
	{
		return number * number;
	}
	
	//returns the number cubed
	public static int cube(int number)
	{
		return number * number * number;
	}
	
	//returns average of 2 given doubles
	public static double average(double number1, double number2)
	{
		return (number1 + number2)/2;
	}
	
	//returns average when given more than 2 doubles
	public static double average(double number1, double number2, double number3 )
	{
		return (number1 + number2 + number3)/3;
	}
	
	//returns degrees when given radian
	public static double toDegrees(double number1)
	{
		return (number1 * 180)/ 3.14159;
	}
	
	//returns radian value after given degree
	public static double toRadians(double number1)
	{
		return (number1 * 3.14159) / 180;
	}
	
	//returns output of discriminant after using given coefficients of a quadratic formula
	public static double discriminant(double number1, double number2, double number3)
	{
		return (number1*number1)- (4*number2*number3);
	}
	
	//returns improper fraction after given mixed number
	public static int toImproperFrac(int numerator, int denominator, int whole) 
	{
		int x = whole * denominator + numerator;
		return x/ denominator;
	}
	
	//returns mixed number after given an improper fraction
	public static int toMixedNum(int numerator, int denominator) 
	{
		return numerator/ denominator;
	}
	
	//returns "a*c*var^2 + (a*d + b*c)*var + b*d" form after given 3 integers a variable
	public String foil(int co1, int int1, int co2, int int2, String var) 
	{
		int ax = co1 * co2;
		int bx = co1 * int2 + int1 * co2;
		int cx = int1 * int2;
		return ax + var + "^2" + "+" + bx + var +"+" +cx;
	}
	
	//returns true/false statement
	public static boolean isDivisibleBy(int num1, int num2) 
	{
		if (num1%num2 == 0) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	//returns absolute value of double
	public static double absValue (double num1) 
	{
		if (num1 < 0) 
		{
			return num1 * (-1);
		}
		else
		{
			return num1;
		}
	}
	
	//returns larger when given 2 doubles
	public static double max (double num1, double num2) 
	{
		if (num1 < num2)
		{
			return num2;
		}
		else 
		{
			return num1;
		}
	}
	
	//returns larger from 3 given doubles
	public static double max (double num1, double num2, double num3)
	{
		return max(num1, max(num2, num3));
	}
	
	//returns smaller when given 2 integers
	public static int min(int num1, int num2
			) {
		if(num1<num2)
		{
			return num1;
		}
		else 
		{
			return num2;
		}
	}
	
	public static double round2 (double num1)
	{
		int output = (int)(num1*1000);
		if(output%10>=5) 
		{
			return ((int)((output+10)/10))/100.0;
		}
		else
		{
			return (output/10)/100.0;
		}
	}
	
	//returns a double by raising a value to a positive integer power
	public static double exponent(double value, int expo) 
	{
		double answer = value;
		if (expo < 0) 
		{
			System.out.println("Can not calculate");
		}
		for (int i = 0; i < expo - 1; i++)
		{
			answer *= value;
		} return answer;
	}
	
	//returns the factorial of the value passed
	public static int factorial (int num1) 
	{
		if (num1 == 1) 
		{
			return 1;
		} 
		else if (num1 <0)
		{
			System.out.println("Can not calculate");
		}
		int output = num1 * factorial(num1 - 1);
		return output;
	}
	
	public static boolean isPrime(int num1)
	{
		for(int i = 2; i <num1; i+=1)
		{
			if (isDivisibleBy(num1, i))
			{
				return false;
			}
			else 
			{
				return true;
			}
		}
	return true;
	}
	//find the greatest common factor of two integers
	public static int gcf(int num1, int num2)
	{
		int output = 1;z
		for(int i = 1; i <=num1; i+=1)
		{
			if(isDivisibleBy(num1, i) && isDivisibleBy (num2,i)) 
			{
				output = i;
			}
		}
		return output;
	}
	//
	public static double sqrt (double num)
	{
		return sqrt;
	}
}