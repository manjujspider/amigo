// write 10 pgms with real time example static to Non static
class Student
{
   static String In_name="Jspider";
   int javamock;
  

   public static void main (String[] args)
   
   {  
	   System.out.println("Institute name is:"+In_name);
	     Student s1 = new Student();
		 s1.javamock=1;
		 System.out.println("Geetha Mock rating is "+ s1.javamock);
		 
		 Student s2 =new Student();
		 s2.javamock=2;
		 System.out.println("sanju Mock rating is "+ s2.javamock);
		  s2.javamock=1;
		  System.out.println("sanju Mock rating is "+ s2. javamock);
		 

        }
}

