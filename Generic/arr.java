import java.util.*;
class stud
{
  int id;
   String name;
   stud(int i,String s)
   {
      name=s;
      id=i;
   }

   int getId()
   {
      return id;
   }
   String getname()
   {
     return name;
   }

   void check(ArrayList<stud> a)
   {
	     stud idd=a.get(0);

	     for(stud s:a )
	     {
			if(s.getId()==idd.getId())
			{
				System.out.print("Equals");

				}
				else
				{

				System.out.print("Not Equals");

					}
		 }

   }
}
class arr
{
public static void main(String arg[])
{
    List<stud> arraylist_obj=new ArrayList<>();
  stud s1=new stud(10,"Abc");

  stud s2=new stud(11,"Cde");

  stud s3=new stud(12,"Fgh");
  arraylist_obj.add(s1);
   arraylist_obj.add(s2);
    arraylist_obj.add(s3);
    Collections.sort(arraylist_obj.getId());


 }

}
