interface sai33
{
public void read();
public void display();
}
class der33 implements sai33
{
   public void read()
   {
     System.out.println("inside read");
   }

      public void display()
      {
        System.out.println("inside read");
   }
}

class main33
{
   public static void main(String aa[])
   {

      der33 d=new der33();
      d.read();

   }
}