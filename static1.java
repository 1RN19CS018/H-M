//static variable
class A{
    static int x=1000;
    static void display(){
        System.out.println("hi display");
    }


}

public class static1{
    public static void main(String[] args) {
        A.display();
        System.out.println(A.x);
    }
}