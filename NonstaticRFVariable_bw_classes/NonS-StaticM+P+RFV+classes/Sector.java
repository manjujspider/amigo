class Sample
  {
    void area( int r ,double t)
       {
         
		 double res=0.5*( r*r* t);
          System.out.println(res);
       }
  }
  class Sector
  {
  
    public static void main (String[] args)  
     {
        Sample a= new Sample();
		a.area( 8,45.0);
		}
}