class College
{
   static String name =" Jspider";
   String  courses;
   int course_fees;
   
   public static void main (String[] args)
   
    {  
	   
	   College c1= new College();
	    c1.courses="Java";
	    System.out.println("  College Name is :"+name);
	   
	      System.out.println("Colleage course :"+c1.courses);
	   
	     College c2=new College();
		  c2.course_fees= 40000;
		
		 System.out.println(" Course fees:"+c2.course_fees);
		 
	   }
}
        