import java.util.Scanner;
class ladderif
{
public static void main(String args[])
{
int m1,m2,m3;
float total;
System.out.println("enter the marks of subject m1 ");
Scanner obj=new Scanner(System.in);
m1=obj.nextInt();
System.out.println(" entr marks of m2");
Scanner obj2=new Scanner(System.in);
m2=obj2.nextInt();; 
System.out.println(" enter MARKS of m3"); 
Scanner obj3=new Scanner(System.in);
m3=obj3.nextInt();
if((m1||m2||m3)<=35)
{
System.out.println(" SORRY YOU  ARE FAIL"); 
}
else
{
total=((m1+m2+m3)/100)*3;
System.out.println("PERCENTAGE="+total); 
}
System.out.println("MARKS ARE "+m1);
System.out.println("MARKS ARE "+m2);
System.out.println("MARKS ARE "+m3);
}
}