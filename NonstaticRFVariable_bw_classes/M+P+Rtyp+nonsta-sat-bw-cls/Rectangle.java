class Sample
  {
    double area( int w, int h)
       {
          
          double res= w*h;
          return res;
       }
  }
  class Rectangle
  {
  
    public static void main (String[] args)  
     {
      Sample a= new Sample();
        double b=a.area(10,20);
		System.out.println(b);
      
		}
}