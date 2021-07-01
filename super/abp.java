interface emp11
{
  public int a=10,b=30;
  public void read();
  public void display();
}
public class abp implements emp11
{

  public  void read()
   {
      System.out.println("inside abp");
   }
  public  void display()
   {
      System.out.println("A  "+a+"B"+b);
   }


  public static void main(String aa[])
  {
     abp  s=new abp();
       s.read();
       s.display();
  }
}
