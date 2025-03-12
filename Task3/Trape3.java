class Trape3
{

	static double  area( )
	{
		
		int a=5;
		int b=10;
		int h=12;
		double res= 0.5(a+b)*h;
		return res;		
	}

	public static void main(String[] args)
	{
		
	    double ans = area();
		System.out.println("Area of Trapezoid  is :"+ ans);
		
	}
	
}