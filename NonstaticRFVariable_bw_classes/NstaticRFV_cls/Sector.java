class Sample
  {
    void area()
       {
          double t= 45.0;
         int r= 10;
		 double res=0.5*( r*r* t);
          System.out.println(res);
       }
	   
  }
  class Sector
  {
  
    public static void main (String[] args)  
     {
        Sample a= new Sample();
		a.area();
		}
}