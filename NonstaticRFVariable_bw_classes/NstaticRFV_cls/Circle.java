class Sample
{

    void area()
       {
          final double pi= 3.142;
		  int r=5;
		  double res= pi*r*r;
		  System.out.println(res);
       }
 }
 class Circle
   {
     public static void main (String[] args)  
       {
         Sample x=new Sample();
		   x.area();
		}
   }
    