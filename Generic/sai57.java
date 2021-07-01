class Gen<T ,V>
{
      T str[];
      V intg[];
      Gen(T s[],V i[])
      {
          str=s;
          intg=i;
      }

      void display()
      {
          for(int i=0;i<=str.length-1;i++)
          {
             System.out.println("  "+str[i]);
          }
          System.out.println("--------------------");
          for(int i=0;i<=intg.length-1;i++)
	            {
	               System.out.println(""+intg[i]);
          }
      }
}

class sai57
{
   public static void main(String aad[])
   {
      Integer i[]={22,34,1,2,332,12,67,889,31};
      String s[]={"Saurabh","Sahil","Rahul"};
      Gen<Integer,String> is=new Gen<Integer,String>(i,s);
      is.display();

   }
}
