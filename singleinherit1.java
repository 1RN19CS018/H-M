
//child class constructor automatically calls the parent class constructor
import java.util.Scanner;
class Emp{
    int ID;
    String name;
    int age; 
    float salary;
    String desgn;
	Emp() //NO RETURN TYPE , SHOULD BE SAME AS CLASS NAME 
	{
		Scanner sc= new Scanner(System.in); 
		 
		System.out.println("Enter ID: ");
		int ID=sc.nextInt();

		System.out.println("Enter name: ");
		name=sc.next();

		System.out.println("Enter age: ");
		age=sc.nextInt();
		
		
    }
    void display()//method has rtype
        {
            System.out.println("ID: "+ID);
		    System.out.println("Name: "+name);
		    System.out.println("Age: "+age);
		    System.out.println("Salary: "+salary);
		    System.out.println("Designation: "+desgn);
        }
		
}
class Dev extends Emp{
    
	Dev() //NO RETURN TYPE , SHOULD BE SAME AS CLASS NAME 
	{
         salary=50000;
         desgn="Dev";
		
    }
        
		
}
class Clerk extends Emp{
   
    
	Clerk() //NO RETURN TYPE , SHOULD BE SAME AS CLASS NAME 
	{
		salary=20000;
        desgn="clerk";
		
    }
		
}

public class singleinherit1
{

	public static void main(String args[])
	{
        int ch=0;       
        Scanner sc = new Scanner(System.in);
    do{ 
        System.out.println("Enter the choice");
        ch=sc.nextInt();

        if(ch==1){
        System.out.println("Hi dev");
		Dev d=new Dev();
        d.display();
    }
    else if(ch==2){
        System.out.println("Hi clerk");
		Clerk c=new Clerk();
        c.display();

    }
    else if(ch==3){
        System.out.println("Thank you");
        System.exit(0);
    }
    else{
        System.out.println("Invalid Choice!");

    }
}while(ch!=3);		

	}
}