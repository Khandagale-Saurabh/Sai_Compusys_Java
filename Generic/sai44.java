class gen<T >
{
   T obj;
   gen(T obj)
   {
	 this.obj=obj;
   }
   public void show()
   {
      System.out.println(""+obj.getClass().getName());
   }
   public void data()
   {
     System.out.print(""+obj);
   }
   public void equal(gen<?> o2)
   {
	    boolean c= (obj.equals(o2.obj))?true:false;
	     System.out.println(" "+c);
	   }

}
class sai44
{
   public static void main(String aa[])
   {
			  gen<Double> obj=new gen<Double>(900.3);
			  obj.show();
			  obj.data();
			  gen<Integer> obj1=new gen<Integer>(900);
					obj1.show();
			  obj1.data();
			  obj.equal(obj1);
		  /*    gen<String> obj1=new gen<String>("Saurabh");
					obj1.show();
					obj1.data();  */


   }
}
