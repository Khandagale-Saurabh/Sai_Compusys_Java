abstract class sai56
{
 int l=0;
 int w=0;
 public int area(int l1,int w1)
  {
  l=l1;
  w=w1;
    return l*w;
  }

 }
 class sai57 extends sai56
 {
	  public void ee()
	  {
		  {
		     l=10;
		     w=30;
		      int c=0;
		      c=area(l,w);
		      System.out.println(c);

  }
		  }
 public static void main(String args[])
   {
	   sai57 s=new sai57();
	   //s.area(20,30);
	   s.ee();
	   }

 }