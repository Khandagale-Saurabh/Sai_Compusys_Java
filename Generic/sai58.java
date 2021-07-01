class Gen<T>
{
	T obj[];
	Gen(T q[])
	{
		obj=q;
	}

	boolean display()
	{
		int sum=0;
		for(int i=0;i<=obj.length-1;i++)
		{
			System.out.println("  "+obj[i]);
		    sum+=obj[i];
		}

	}

	boolean check(Gen<?> c[])
	{
          if(display()=c.display())
          {

			  }
	}


}

class sai58
{
   public static void main(String aad[])
   {
      Integer s[]={22,3,4,67};
     Gen<Integer> f=new Gen<Integer>(s);
     f.display();
   }
}
class Gen<T>
{
	T obj[];
	Gen(T q[])
	{
		obj=q;
	}

	boolean display()
	{
		int sum=0;
		for(int i=0;i<=obj.length-1;i++)
		{
			System.out.println("  "+obj[i]);
		    sum+=obj[i];
		}

	}

	boolean check(Gen<?> c[])
	{
          if(display()=c.display())
          {

			  }
	}


}

class sai58
{
   public static void main(String aad[])
   {
      Integer s[]={22,3,4,67};
     Gen<Integer> f=new Gen<Integer>(s);
     f.display();
   }
}
