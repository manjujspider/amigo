class Sample
  {
    double area(int a, int b, int h)
       {
         
		 double res= 0.5*(a+b)*h;
          return res;
       }
  }
  class Trapezoid
  {
  
    public static void main (String[] args)  
     {
        Sample x = new Sample();
		double y = x.area(10,20,8);
		System.out.println(y);
		}
}