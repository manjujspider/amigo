// write a program nonstatic to static with method with parameter with returntype 
class Circle
  {
    double area( int r)
       {
          final double pi= 3.142;
		  double res= pi*r*r;
		  return res;
       }
    public static void main (String[] args)  
     {
        Circle x=new Circle();
		double a=x.area(5);
		System.out.println(a);
		}
}