package JavaBasics2;

public class VariablesInJAVA {
	
	public static float var1=3;
	public static String deptname; //method area
	public int rollno;//stored in heap memory
	public String name="ramya";
 
	public static void main(String [] args)
	{
		VariablesInJAVA var=new VariablesInJAVA(); //reference variables or address variable
		
		System.out.println(var.var1); //variable calling
		System.out.println(VariablesInJAVA.var1);
		System.out.println(var.rollno);
		var.sum();  //method calling
		VariablesInJAVA.substraction();
		
	}
	
	public void sum()
	{
		int i=0; //local variable
		int j=1;
		System.out.println(i+j);
		System.out.println(rollno);
		
		
	}
	
	public static void substraction()
	{
		VariablesInJAVA var=new VariablesInJAVA();
		System.out.println(var.rollno);
		
		
		
	}
	
	
	
	
}
