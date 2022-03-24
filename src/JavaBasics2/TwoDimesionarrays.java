package JavaBasics2;

public class TwoDimesionarrays {

	int[][] array1= { {1,2,4}, {5,6,7}};
	
	public static void main(String[] args)
	{
		TwoDimesionarrays object1=new TwoDimesionarrays();
		System.out.println(object1.array1);
		int[][] array1= { {1,2,4}, {5,6,7}};
		int[][] array2=new int[2][3];
		int count=0;
		
		for(int index=0;index<array2.length;index++) //for row traversing  -> index->0->1 //assigning the arrays elements
		{
			
			for(int index1=0;index1<array2[0].length;index1++)  //column traversing  -> index1->0 ->1->2->3
			{ 
				
				array2[index][index1]=count;
				count++; //++ is called incrementing operator -> count->1->2->3
				
			}
			
			
			
		}
		
		for(int index=0;index<array2.length;index++) //for row traversing  -> index->0->1  //accessing the elements
		{
			
			for(int index1=0;index1<array2[0].length;index1++)  //column traversing  -> index1->0 ->1->2->3
			{ 
				
				System.out.println(array2[index][index1]);
				
			}
			
			
			
		}
		
		
		
	}
}
