class first
{
	int a1=10;
	  first(int a1)
	  {
	  System.out.println("In parent firest constructor"+a1);

		  }
  public void dis1()
  {
    System.out.println("In parent");
  }
}
class second extends first
{

int b1=100;
		  second(int a1,int b1)
		  {
			  super(10);
		  System.out.println("In parent second constructor"+a1+""+b1);

		  }
  public void dis2()
  {
     System.out.println("in second");
  }
}

class third extends second
{

		  third()
		  {
		  System.out.println("In parent third constructor");

		  }
  public void dis3()
  {
     System.out.println("in third");
  }
}
class saii extends third
{
 public static void main(String args[])
 {
	 first f=new second();
	 f.dis2();
  }
}