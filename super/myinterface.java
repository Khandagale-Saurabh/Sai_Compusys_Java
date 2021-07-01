interface first
{
  public void display();

}
interface second extends first
{
	public void show();
	}
class myinterface implements first,second
{

       public void display()
       {
        System.out.println("In display()");
     }
     public void show()
     {
		    System.out.println("In show()");

		 }

  public static void main(String args[])
  {
      myinterface n=new myinterface();
      n.display();
      myinterface nn=new myinterface();
          nn.show();
          nn.display();
          first x=new myinterface();
          ((second)x).show();

  }
}