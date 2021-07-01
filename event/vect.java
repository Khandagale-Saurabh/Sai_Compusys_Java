import java.util.*;
class vect
{
  public static void main(String args[])
  {
    Vector<Integer> obj=new Vector<Integer>(3);
    System.out.println(""+obj.capacity());
    obj.add(1);
obj.add(2);obj.add(3);
obj.add(2);obj.add(3);
obj.add(1);
obj.add(2);obj.add(3);
obj.add(2);obj.add(3);

System.out.println(obj.add(2,2));

  System.out.println(""+obj.capacity());
    }
}