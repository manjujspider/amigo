class Sample
  {
    void area(int b, int h)
       {
        
		 double res= b*h;
          System.out.println(res);
       }
  }
  class Paralellogram
  {
  
    public static void main (String[] args)  
     {
        Sample x = new Sample();
	     x.area(10,20);
		}
}