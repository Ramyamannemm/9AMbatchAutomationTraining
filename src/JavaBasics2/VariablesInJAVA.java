package JavaBasics2;

public class VariablesInJAVA {
	
	public static float var1=3;
	public static String deptname; //method area
	public int rollno; //stored in heap memory
 
	public static void main(String [] args)
	{
		VariablesInJAVA var=new VariablesInJAVA(); //reference variables or address variable
		
		System.out.println(var.var1);
		System.out.println(VariablesInJAVA.var1);
		
	}
	
	
	
	
}
