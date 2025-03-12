class Circ
{
  static double area( int r)
      {
           final double pi= 3.142;
		     double  res= pi*r*r;
           return res;
  
     }
	 
}	 
	 
class Circle
{ 

	public static void main (String [] args)
	{
		double ans=Circ.area(100);
		
		System.out.println("Area of circle is:" + ans);
		
	    }
	

}
