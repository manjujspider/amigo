class Laptop
{
   static String name="DELL";
    int cost;
	String brand; 
   public static void main (String[] args)
   
    {  
		Laptop a= new Laptop();
		  a.cost=150000;
		  
		  Laptop b= new Laptop();
		  b.brand="AI support";
		  
		  System.out.println("Laptop Name is :"+name);
		  System.out.println("Laptop cost is :"+a.cost);
		  System.out.println("Laptop Brand is :"+b.brand);
	  		 
	   }
}