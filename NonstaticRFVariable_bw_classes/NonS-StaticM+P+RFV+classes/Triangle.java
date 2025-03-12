class Sample
  {
    void area( int b, int h)
       {
         
		  double res= 0.5*b*h;
		  System.out.println(res);
       }
  }
  class Triangle
  {
  
    public static void main (String[] args)  
     {
        Sample x=new Sample();
		x.area(10,15);
		}
}