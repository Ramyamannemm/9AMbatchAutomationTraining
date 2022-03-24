package JavaBasics2;

public class Overloading {

	public static void main(String[] args)
	{
		Overloading overload=new Overloading();
		int k=overload.sum(); //compile time poly or method overloading or early binding
		System.out.println(k);
		overload.sum(2);
		//overload.sum(2, 3);
		
		
		
		
		
	}
	
	
	
	public int sum()
	{
	
		int a=3;
		int b=4;
		System.out.println(a+b);
		return a+b;
		
	}
	public void sum(int a)
	{
		int b=4;
		System.out.println(a+b);
	}
	public void sum(double a)
	{
		System.out.println(a);
		
		
	}
	
	
	
	
}
