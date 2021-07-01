class super11
{
int a=0,b=0;
  public super11(int a1,int b1)
  {
     a=a1;
     b=b1;
     System.out.println("inside parent"+a+" "+b);
  }

  final  public void dii()

  {
	   System.out.println("dii 1");
	}
}
class der11 extends super11
{

             public void dii()

	        {
	       	   System.out.println("dii 2s");
	    	}

  public der11(int a1,int b1,int c1)
  {
	  super(10,20);
	  c1=60;

    System.out.println("inside der11  "+c1);
  }
  public static void main(String aa[])
  {
    // der11 d=new der11(10,10,10);
     //d.ss();
     super11 sobj=new der11(10,20,3);
     sobj.dii();
      super11 sss=new super11(10,20);
 }


}