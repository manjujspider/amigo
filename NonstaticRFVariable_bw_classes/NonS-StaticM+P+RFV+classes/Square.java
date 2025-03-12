class Sample
  {
    void area(int a)
       {
         int res= a*a;
          System.out.println(res);
       }
	   
  }
  class Square
  {
  
    public static void main (String[] args)  
     {
		Sample a=new Sample();
		a.area(8);
        
		}
}