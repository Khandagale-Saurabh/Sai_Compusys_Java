

import java.io.*;
import java.util.*;
class p
{
	public static  void ptr(String s)
	  {
		  System.out.println(""+s);
		  }
	}
class sai60
{
   public static void main(String aa[]) throws Exception
   {
	FileOutputStream fout =new FileOutputStream("f1.txt",true);
	DataOutputStream dout=new DataOutputStream(fout);
	dout.writeInt(2);
	FileInputStream fin=new FileInputStream("f1.txt");
	DataInputStream din=new DataInputStream(fin);
	p.ptr(" "+din.readInt());
   }
}
