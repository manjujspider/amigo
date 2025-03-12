class Cars
{
   static String Brand=" AUDI";
   String  Modelname;
   String  cartype;
   
     public static void main (String[] args)
   
       {  
	   
	   System.out.println("Car Brand  Name is :"+Brand);
	     Cars c1= new Cars();
	      c1.Modelname="e-tron";
	   
	   System.out.println("Car Model name is :"+c1.Modelname);
	   
	    Cars c2=new Cars();
		// String d=c2.cartype="Hybrid";
		 c2.cartype=" Electric";
		// System.out.println(d);
		 System.out.println(" Car tye  is :"+c2.cartype);
		 

        }
}
