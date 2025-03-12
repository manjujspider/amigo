class Sample
{
  static double area( int a,int b)
      {
	     final double pi=3.142;
         double  res= pi* a*b;
           return res;
  
     }
	 
}	 
	 
class Ellipse
{ 

	public static void main (String [] args)
	{
		double ans=Sample.area(10, 20);
		
		System.out.println("Area of Ellipse is:" + ans);
		
	    }
	

}
