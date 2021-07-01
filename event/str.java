class str
{
   public static void main(String args[])
   {
     String s="Sai compyusys";
     int l=s.length();
     System.out.println("length "+l);
      char s1=s.charAt(2);

     System.out.println("length "+s1);

     StringBuffer d= new StringBuffer("Inside");
     StringBuffer p=new StringBuffer("Inside");
     if(d.equals(p))
     {
	System.out.println("Equal");

		 }else{System.out.println("!Equal");
		 System.out.println(""+d.deleteCharAt(2));

}
   }
}