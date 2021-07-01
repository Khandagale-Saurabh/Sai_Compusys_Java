import java.applet.Applet;
import java.awt.*;
public class saiapplet extends Applet implements Runnable
{
  public void init()
  {
    System.out.println("Born");
  }
  public void start()
  {
      System.out.println("start");

  }

    public void stop()
    {
        System.out.println("stop");

  }


    public void paint()
    {
        System.out.println("paint");

  }
    public void destory()
    {
		try{

        System.out.println("destory");
	     Thread.sleep(2000);
	   }catch(Exception f){}

  run();
  {//println
	  }
    }
}