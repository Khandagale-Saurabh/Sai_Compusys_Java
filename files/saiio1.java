import java.io.*;
class saiio1
{
	public static void main(String arggg[])throws IOException
	   {
		   FileInputStream ss=new FileInputStream("sw.txt");
		   int i=0;
		   while(i=ss.read())!=-1)
		   {
		   System.out.println((char)i);
		   }
	   }
	}