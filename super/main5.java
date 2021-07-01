interface emp11
{

  public void read();
  public void display();
}
public class abp implements emp11
{

   void read()
   {
      System.out.println("inside abp");
   }
   void disp()
   {
      System.out.prinln("A  "+a+"B "+b);
   }


  public static void main(String aa[])
  {
     abp  s=new abp();
     s.read();
     s.disp();
  }
}
