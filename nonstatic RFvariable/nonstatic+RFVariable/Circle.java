class Circle
  {
    void area()
       {
          final double pi= 3.142;
		  int r=5;
		  double res= pi*r*r;
		  System.out.println(res);
       }
    public static void main (String[] args)  
     {
        Circle x=new Circle();
		x.area();
		}
}