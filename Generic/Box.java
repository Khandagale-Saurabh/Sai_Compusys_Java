class Box<T>
{
  T t;
   public  void setOBJ(T t)
   {
      this.t=t;
   }
   public T getObj()
   {
       return t;
   }

   public static void main(String aa[])
   {
      Box<Integer> b=new Box<>();
      b.setOBJ(20);
      p.ptr(" data"+b.getObj());
      Box<String> ss=new Box<String>();
      ss.setOBJ("Saurabh");
        p.ptr(""+ss.getObj());
   }
}
