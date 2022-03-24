package JavaBasics2;

public class IFelse {

	public static void main(String[] args)
	{
		int fees=50000;
		IFelse.feesmethod(fees);		
		
	}
	
	
	public static void feesmethod(int fees) 
	{
	   if(fees>100000)
	   {
		   System.out.println("person is a management quota");
	   }
	   else
	   {
		   System.out.println("person got the scholarship");
	   }
		
		
	}
	
	
	
	
}
