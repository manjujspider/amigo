class Sample
   {
     static void area(int w, int h)
      {
        int result=w*h;
         System.out.println(result);
       }
    }
class Rectangle
    {
        public static void main(String[] args)
           {
	     Sample.area(5,7);
         }
       }