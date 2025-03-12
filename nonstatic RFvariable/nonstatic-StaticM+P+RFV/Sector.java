class Sector
  {
    void area( int r ,double t)
       {
         
		 double res=0.5*( r*r* t);
          System.out.println(res);
       }
    public static void main (String[] args)  
     {
        Sector a= new Sector();
		a.area( 8,45.0);
		}
}