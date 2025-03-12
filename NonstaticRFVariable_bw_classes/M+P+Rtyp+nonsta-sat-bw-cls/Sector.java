class Sample
  {
     double area( int r ,double t)
       {
         
		 double res=0.5*( r*r* t);
          return res;
       }
  }
  class Sector
  {
  
    public static void main (String[] args)  
     {
        Sample a= new Sample();
		double b = a.area(8,45.0);
		System.out.println(b);
		}
}