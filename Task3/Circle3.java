class Circle3
{

	static double  area( )
	{
		
		final double pi= 3.142;
		int r=6;
		double res=pi*r*r;
		return res;		
	}

	public static void main(String[] args)
	{
		
	    double a = area();
		System.out.println("Area of circle  is :"+ a);
		
	}
	
}