class Ellip3
{
	
	static double  area( )
	{
		
		int a=8;
		int b=12;
		final double pi= 3.142;
		double res= pi*a*b;
		return res;		
	}

	public static void main(String[] args)
	{
		
	    double c = area();
		System.out.println("Area of Sector  is :"+ c);
		
	}
	
}