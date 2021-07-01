class sai57 implements Runnable
{
   public void run()
   {
      System.out.println("dd "+Thread.currentThread().isAlive());

   }
}
class sai58
{
  public static void main(String args[])
  {
     sai57 b1=new sai57();
    sai57 b2=new sai57();
    sai57 b3=new sai57();
    Thread t1=new Thread(b1,"First");
    Thread t2=new Thread(b2,"second");
    Thread t3=new Thread(b3,"Third");


   System.out.println(""+t1.isAlive());

   t1.setPriority(1);
   t1.start();
   t2.setPriority(2);
   t2.start();
   t3.setPriority(3);
   t3.start();
   int p=0;
   p=t1.getPriority();
    System.out.println(p);
   try{

     t2.join();

    System.out.println("In main()");
    }catch(Exception e)
    {}
  }
}