import java.io.*;
class saifile3
{
  public static void main(String args[]) throws IOException
  {
     File f=new File("File1.txt");
     FileWriter f1=new FileWriter(f,true);

     String ss="SaurabhKhandagale";

      for(int i=0;i<=ss.length();i++)
      {
		  f1.write((char)i);
		  }
		   f1.flush();

  }
}