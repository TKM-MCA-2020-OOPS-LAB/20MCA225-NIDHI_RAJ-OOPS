import arithmetic.operation.*;
import java.util.*;
public class TestArth
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		add A=new add();
		subtract S=new subtract();
		mul M=new mul();
		divide D=new divide();
		A.addition(num1,num2);
		S.subtraction(num1,num2);
		M.multiplication(num1,num2);
		D.division(num1,num2);
	}
}