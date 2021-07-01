class  dis1
{
  protected void display()
  {
    System.out.println("inside super1");
  }
}
class dis2 extends dis1
{

    protected void display()
    {
      System.out.println("inside super2");
  }
}
class dis3 extends dis2
{

    protected void display()
    {
      System.out.println("inside super3");
    }
}

class main3
{
   public static void main(String a[])
   {
      dis1 d1=new dis1();
      d1.display();
      dis2 d2=new dis2();
      d2.display();
      dis3 d3=new dis3();
      d3.display();


      System.out.println("Magic");
     dis1 ref;
     ref=d1;
     ref.display();
     ref=d2;
     ref.display();


   }
}