package JavaBasics2;

public class Car {

	public Parent wheels()
	{
		System.out.println("Car wheels methods");
		return new Parent();
	}
	public void stearing()
	{
		System.out.println("stearing method");
	}
	
	public static void seatbelt()
	{
		System.out.println("car seat belt");
	}
	
	public static void main(String [] args)
	{
		Swift swiftdesire=new Swift();
		swiftdesire.autodriving();
	}
	
	
	
	
	
}
