class Sample
  {
    void area()
       {
          int b= 10;
		  int h=15;
		  double res= 0.5*10*15;
		  System.out.println(res);
       }
  }
  class Triangle
  {
  
    public static void main (String[] args)  
     {
        Sample x=new Sample();
		x.area();
		}
}