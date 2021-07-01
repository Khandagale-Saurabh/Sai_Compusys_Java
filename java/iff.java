import java.util.Scanner;
class iff
{
public static void main(String args[]);
{
int sal,b;
System.out.println("enter the salary");
Scanner obj=new Scanner(System.in);
sal=obj.nextInt();
if(sal>=10000)
{
b=(sal*10)/100;
sal=sal+b;

System.out.println("salary is="+sal);
}
}
}