package JavaBasics2;

public class whileloop {

	
	public static void main(String[] args)
	{
	   
		int number=0;
		
		while(number<10)
		{
			System.out.println(number);
			number++;
			if(number<5)
				continue;
		}
		
		do
		{
			System.out.println("this is do while");
		}while(number<10);
		
		
		
		
	}
}
