interface first
{
   void d();
}
public class saiint2 //implements first
{
	public static void main(String args[])
	{
      first f=new first()
      {
         void d()
         {
          System.out.println("Inside display()");
         }
      };
      f.d();
     }
}