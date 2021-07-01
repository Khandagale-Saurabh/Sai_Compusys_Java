class Table
{

  synchronized public void print1(int n)
  {
     for(int i=0;i<=5;i++)
     {
       System.out.println("  "+i*n);
     }

	    try
	     {
	 		Thread.sleep(300);
	 		}catch(Exception e)
		{}
  }
}
class myth extends Thread
{
   Table t1;

  public void run()
  {
   t1.print1(5);
 }
}
class myth2 extends Thread
{
   Table t2=new Table();

  public void run()
  {
   t2.print1(100);
 }


}

class text
{
	Table t1=new Table();
	Table t2=new Table();
	t1.start();
	t2.start();
	}