
import java.util.Scanner;
class A{
    int ID;
    String name;
    int age;
    float salary;
    String desgn;
	A() //NO RETURN TYPE , SHOULD BE SAME AS CLASS NAME 
	{
		Scanner sc= new Scanner(System.in); 
		 
		System.out.println("Enter ID: ");
		int ID=sc.nextInt();

		System.out.println("Enter name: ");
		name=sc.next();

		System.out.println("Enter age: ");
		age=sc.nextInt();
		
		System.out.println("Enter salary: ");
		salary=sc.nextFloat();

		System.out.println("Enter Designation: ");
		desgn=sc.next();
    }
        void display()
        {
            System.out.println("ID: "+ID);
		    System.out.println("Name: "+name);
		    System.out.println("Age: "+age);
		    System.out.println("Salary: "+salary);
		    System.out.println("Designation: "+desgn);
        }
		
}


public class constmet
{

	public static void main(String args[])
	{
		System.out.println("Hi JAVA");
		A a=new A();
        a.display();
		
		
	}
}