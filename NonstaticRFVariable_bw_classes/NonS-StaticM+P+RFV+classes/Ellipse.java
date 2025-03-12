class Sample
  {
    void area(int a,int b)
       {
          final double pi = 3.142;
		 double res= pi*a*b;
          System.out.println(res);
       }
  } 
  class Ellipse
  {
  
    public static void main (String[] args)  
     {
		Sample x=new Sample();
		x.area(8,15);
        
		}
}