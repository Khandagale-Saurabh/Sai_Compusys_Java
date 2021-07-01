class super1
{
   protected int a,b;
   public void read()
    {
       a=10;
       b=20;
    }
    public void display()
    {
      System.out.println("inside super1{A=  "+a+"B"+b+"}");
    }
    public static void display1()
	    {
	      System.out.println("inside static of super ");
    }
}
class der1 extends super1
{
    int a,b;
   public void display()   {
      System.out.println("inside der1 .....a"+a+"b"+b);
   }
    public static void display1()
   	    {
   	      System.out.println("inside static sub ");
        }

}

class saimain1
{
  public static void main(String a[])
  {
     super1 obj1=new super1();
     obj1.read();
     obj1.display();
     der1 d1=new der1();
      d1.read();
     d1.display();
     d1.display1();

  }
}