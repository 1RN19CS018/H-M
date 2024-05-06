
import java.util.Scanner;
class A{
	A()
	{
		Scanner sc= new Scanner(System.in); 
		 
		System.out.println("Enter ID: ");
		int ID=sc.nextInt();

		System.out.println("Enter name: ");
		String name=sc.next();

		System.out.println("Enter age: ");
		int age=sc.nextInt();
		
		System.out.println("Enter salary: ");
		float salary=sc.nextFloat();

		System.out.println("Enter Designation: ");
		String desgn=sc.next();


		System.out.println("ID: "+ID);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Salary: "+salary);
		System.out.println("Designation: "+desgn);
}

}
public class j2
{

	public static void main(String args[])
	{
		System.out.println("Hi JAVA");
		A a=new A();
		
		
	}
}