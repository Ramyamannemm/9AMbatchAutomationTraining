package JavaBasics2;

import java.util.Random;

public class Arrays {

	public static void main(String [] args)
	{
		String[] names= {"Ramesh","5","Naresh"};
		int[] rollnos= {1,2,6,53543,54534};
		int rollnos1[]= {1,2,3,3};
		
		int [] array1=new int[8]; //arrays length is static in nature
		
		for(int index=0;index<array1.length;index++)//0-1-2----------8  //array initialization
	    {
			array1[index]=getrollNO();
			System.out.println(array1[index]);
		}
		
	}
	public static int getrollNO() //this method is used to generate random integer value
    {
   	   Random random=new Random(); //inbuilt class - java library
		return random.nextInt();
   	 
    }
	
	
	
}
