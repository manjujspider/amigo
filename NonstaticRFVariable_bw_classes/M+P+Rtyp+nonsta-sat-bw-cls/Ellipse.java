class Sample
  {
     double  area (int a,int b)
       {
          final double pi = 3.142;
		 double res= pi*a*b;
          return res;
       }
  }
  class Ellipse
  {
  
    public static void main (String[] args)  
     {
		Sample x=new Sample();
	  double a= x.area(8,15);
		System.out.println(a);
        
		}
}