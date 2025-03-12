// write a program nonstatic to static with method with parameter with returntype 
class Sample
  {
    double area( int r)
       {
          final double pi= 3.142;
		  double res= pi*r*r;
		  return res;
       }
  }
  class Circle
  {
  
    public static void main (String[] args)  
     {
        Sample x=new Sample();
		double a=x.area(5);
		System.out.println(a);
		}
}