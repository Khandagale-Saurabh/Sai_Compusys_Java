class super2
{
  protected int a=101,b=201;
  public void read()
   {
     a=1;
     b=2;
   }
   public void display()
   {
     System.out.println("A="+this.a+"B"+this.b);
   }

   super2()
   {
       System.out.println("inside super class");
   }
}

class sub2 extends super2
{
    sub2()
    {

    super();
    }
}

class saimain2
{
 public static void main(String aa[])
   {
       sub2 ss=new sub2();
   }
}