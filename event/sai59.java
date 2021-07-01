class sai59 extends Thread
{
   public void run()
   {
     System.out.println("Inside function()"+Thread.currentThread());
   }

   public static void main(String[] a)
   {

     sai59 t1=new sai59();

       t1.setName("Function()");
       t1.setPriority(4);
       t1.start();
          System.out.println("Inside function()"+Thread.currentThread());
       t1.run();

    }

}
