class School
{
   static String name="St Mary's school";
    int strength;
	String grade; 
   public static void main (String[] args)
   
    {  
		School a= new School();
		 a.strength= 500;
		 
		 School b= new School();
		 b.grade="A";
		  
		  System.out.println("School  Name is :"+name);
		  System.out.println(" School strength is :"+a.strength);
		  System.out.println("School grade is :"+b. grade);
	  		 
	   }
}