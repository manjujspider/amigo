class Sample
  {
    void area()
       {
          int w= 20;
          int h=10;
          double res= w*h;
          System.out.println(res);
       }
  }
  class Rectangle
  {
  
    public static void main (String[] args)  
     {
      Sample a= new Sample();
         a.area();
      
		}
}