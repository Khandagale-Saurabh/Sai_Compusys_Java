class sai57 extends Thread
{
   public void run()
   {
      for(int i=0;i<=5;i++)
      {
      System.out.println(" "+i*5);
      }
   }
}
class sai58
{
  public static void main(String args[])
  {
    sai57 s=new sai57()
    ;
    s.start();
  }
}