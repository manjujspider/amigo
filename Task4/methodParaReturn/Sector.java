class Sample
    {
       static void area(int r, double t)
        {

          double res=0.5*r*r*t;
          System.out.println(res);
          }
     }
class Sector
   {
      public static void main(String[] arg)
	{
	Sample.area(2,45.2);
	}
    }