class Trapezoids
  {
    void area()
       {
          int a= 10;
         int b= 20;
		 int h= 8;
		 double res= 0.5*(a+b)*h;
          System.out.println(res);
       }
    public static void main (String[] args)  
     {
        new Trapezoids().area();
		}
}