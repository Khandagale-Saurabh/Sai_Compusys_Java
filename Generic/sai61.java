import java.util.*;
class sai61<T>
{
	 T obj1;
	sai61(T o1)
	{
		obj1=o1;
	}
	void equal(sai61<?> a)
	{
		if(obj1.equals(a.obj1))
		{
			p.ptr("equals");
			}
			else
			{
				p.ptr("not");
				}

	}
	public static void main(String aa[])
	{
		sai61<emp1> s1=new sai61<emp1>(r);
		sai61<emp2> s2=new sai61<emp2>(e);
		s2.equal(s1);


	}
}
class emp1
{
	String s=null;
	emp1(String s)
	{
	     this.s=s;
		}
		emp1 r=new emp1("Saurabh");
	}
class emp2
{
	String s=null;
	emp2(String s)
	{
	     this.s=s;
		}
		emp2 e=new emp2("Sahil");
	}
