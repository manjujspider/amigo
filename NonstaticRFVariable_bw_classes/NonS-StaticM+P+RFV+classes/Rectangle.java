class Sample
  {
    void area( int w, int h)
       {
          
          double res= w*h;
          System.out.println(res);
       }
  }
  class Rectangle
  {
  
    public static void main (String[] args)  
     {
      Sample a= new Sample();
         a.area(10,20);
      
		}
}