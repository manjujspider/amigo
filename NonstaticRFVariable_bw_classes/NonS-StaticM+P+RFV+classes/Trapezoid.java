class Sample
  {
    void area(int a, int b, int h)
       {
         
		 double res= 0.5*(a+b)*h;
          System.out.println(res);
       }
  }
  class Trapezoid
  {
  
    public static void main (String[] args)  
     {
        Sample a = new Sample();
		a.area(10,20,8);
		}
}