class Sector
  {
    void area()
       {
          double t= 45.0;
         int r= 10;
		 double res=0.5*( r*r* t);
          System.out.println(res);
       }
    public static void main (String[] args)  
     {
        Sector a= new Sector();
		a.area();
		}
}