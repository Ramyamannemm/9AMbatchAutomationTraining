package JavaBasics2;

public class Student {

	public final static String colgname="VNR";
	public int rollno;
	
	public static void main(String[] args)
	{
		Student Ramesh=new Student();
		Ramesh.rollno=1;
		System.out.println(Ramesh.colgname);
		System.out.println(Ramesh.rollno);
		
		
		
		
		Student Suresh=new Student();
		
		Suresh.rollno=2;
		//Suresh.colgname="Vasavi";
		System.out.println(Suresh.colgname);
		System.out.println(Suresh.rollno);
		
         Student Naresh=new Student();
		
         Naresh.rollno=3;
        // Naresh.colgname="Vasavi";
		System.out.println(Naresh.colgname);
		System.out.println(Naresh.rollno);
	}
	
	
	
}
