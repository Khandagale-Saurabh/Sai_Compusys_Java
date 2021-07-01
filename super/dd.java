abstract class shapes
{
  double dim1=0;
  double dim2=0;
  void display()
  {
    System.out.println(dim1+""+dim2);
  }
  abstract void area();
}
class rectangle extends shapes
{
  public void getdata()
  {
   dim1=10;
   dim2=10;
  }
  void area()
  {

    double c=0;
    c=dim1*dim2;
      System.out.println(c);
  }
}

class triangle extends shapes
{
  public void getdata()
  {
   dim1=10;
   dim2=10;
  }
  void area()
  {

    double c=0;
    c=0.5*dim1*dim2;
      System.out.println(c);
  }
}
class dd
{
 public static void main(String a[])
 {
   rectangle r=new rectangle();
   r.getdata();
   r.area();
   triangle t=new triangle();
   t.getdata();
   t.display();
 }
}