class Ellipse
  {
    void area(int a,int b)
       {
          final double pi = 3.142;
		 double res= pi*a*b;
          System.out.println(res);
       }
    public static void main (String[] args)  
     {
		Ellipse x=new Ellipse();
		x.area(8,15);
        
		}
}