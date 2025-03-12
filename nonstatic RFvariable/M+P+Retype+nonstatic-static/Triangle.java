class Triangle
  {
    double area( int b, int h)
       {
         
		  double res= 0.5*b*h;
		  return res;
       }
    public static void main (String[] args)  
     {
        Triangle x=new Triangle();
		double y= x.area(10,8);
		System.out.println(y);
		}
}