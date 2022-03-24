package JavaBasics2;

public class Swift extends Car{

	public static void main(String [] args)
	{
		Swift swiftdesire=new Swift();
		swiftdesire.wheels();   //overriding
		swiftdesire.stearing();
		swiftdesire.autodriving();
		
		Car car1=new Car();
		car1.wheels();
		//car1.autodriving();
		
		Car car2=new Swift();  //run time polymorphysim
		car2.wheels(); //methods overriding
		car2.seatbelt();
		
		
		
		
		
		
		
	}
	
	public void autodriving()
	{
		System.out.println("autodriving");
	}
	
	public Child wheels()
	{
		int spikes=4;
		
		System.out.println("swift wheels");
		return new Child();
	}
	
	
	public static void seatbelt()
	{
		System.out.println("swift seat belt");
	}
	
	
	
	
}
