abstract class emp
{
  protected int a=10,b=20;
  String s="Saurabh";
 abstract public void read();
 abstract public void display();
   public void ss()
   {
	   System.out.println("insnsn");
	  }
}

class empder extends emp
{
   public void read()
   {
      System.out.println("inside read of der");
   }
   public void display()
   {
     System.out.println("String "+s);
     System.out.println("A "+a+"B "+b);
   }
   public static void disp()
   {
	  System.out.println("INside static function");
   }
}

class main4
{
  public static void main(String aa[])
  {
     empder ee=new empder();
     ee.read();
     ee.display();
     empder.disp();
   }
}