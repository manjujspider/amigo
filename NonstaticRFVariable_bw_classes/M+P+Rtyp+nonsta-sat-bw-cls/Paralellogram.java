class Sample
  {
    double area(int b, int h)
       {
        
		 double res= b*h;
          return res;
       }
  }
  class Paralellogram
  {
  
    public static void main (String[] args)  
     {
        Sample x = new Sample();
	    double a=x.area(10,20);
		System.out.println(a);
		}
}