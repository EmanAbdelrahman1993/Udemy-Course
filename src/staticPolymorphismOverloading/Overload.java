package staticPolymorphismOverloading;

public class Overload {

	public void print(int a) 
	{
		System.out.println("a equals :" + a);
	}
	
	public double print(double a) 
	{
		System.out.println("double a: " +  a);
		return a*a;
	}
	
	public void print(int a , int b) 
	{
		System.out.println("a * b = : " + a*b);
	}
	
}
