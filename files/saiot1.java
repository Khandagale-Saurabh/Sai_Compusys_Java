import java.io.*;
class saiot1
{
   public static void main(char args[])throws IOException
   {

    // FileOutputStream ot=new FileOutputStream("s2.txt",true);
     FileOutputStream ot=new FileOutputStream("s2.txt");
     ot.write(30);
     ot.write(new char[]{"s","s"});
     ot.write(new byte[]{20,30,40});
     ot.write(new byte[]{40});
      ot.write(30);
   }
}