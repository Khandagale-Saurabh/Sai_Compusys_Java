class A
{
   public void display()
   {
    System.out.println("Inside A");
   }
}
class B extends A
{
   public void display()
   {

    System.out.println("Inside b");
   }
}
class sai1
{
  public static void main(String aa[])

  {
      A a1=new A();
     // a1.displayA();
     B b1=new B();
     a1.display();
     b1.display();

  }
}
