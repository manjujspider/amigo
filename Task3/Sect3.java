class Sect3
{
	
	static double  area( )
	{
		
		int r=4;
		int t=30;
		double res=(r*r*t)*1/2;
		return res;		
	}

	public static void main(String[] args)
	{
		
	    double a = area();
		System.out.println("Area of Sector  is :"+ a);
		
	}
	
}