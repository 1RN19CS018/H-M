// constructor overloading
class A{
    int a;
    A()
    {
        System.out.println("A()"+a);
    }
    A(int a)
    {
        System.out.println("A(int a)"+a);
    }
    A(int a,int b)
    {
        System.out.println("A(int a, int b)"+a+b);
    }
    A(String a, int b)
    {
        System.out.println("A(String a,int b)"+a+b);
    }
}

public class co{

    public static void main(String args[]){
        A a=new A();
        A a1=new A(10);//constructor overloading
        A a2=new A(10,30);
        A a3=new A("Class",40);

    }
}