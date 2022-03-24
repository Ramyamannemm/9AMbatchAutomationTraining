package JavaBasics2;

public class DataTypes {

   public int age;
	
   public byte id=127;
   public short id1=1234;
   public int age1;
   public long age2;
   public float value=1.2f; //decimal point values
   public double value2=1.2;
   public char c='d'; //only character
   public boolean b1=true;   //true or false
   
  // ----------------------------------------
  public static void main(String[]args) 
  {
	  
	  
     int value1='C'; //ASCII value of c
     System.out.println(value1);
     
     char c=12;
     System.out.println(c);
     
     AccessModifiers modify=new AccessModifiers();
     int j=modify.age;
     System.out.println(j);
     
    // int k=modify.creditnumber;
     
  }
   
	
}
