import java .io.*;
class saiio2
{
  public static void main(String args[])throws IOException
  {
    FileInputStream ff=new FileInputStream("sw.txt");
        int i=0;
        while((i=ff.read())!=-1)
        {
          System.out.print((char)i);
        }
  }
}