class Tri
{
  static double area( int b,int h)
      {
         
		     double  res=  0.5* b*h;
           return res;
  
     }
	 
}	 
	 
class Triangle
{ 

	public static void main (String [] args)
	{
		double ans=Tri.area(10, 20);
		
		System.out.println("Area of Triangle is:" + ans);
		
	    }
	

}
