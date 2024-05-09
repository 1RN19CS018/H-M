interface I{
    int a=10;
    void add();
    void sub();
}
interface J{
    int b=10;
    void mul();
    void div();
}
interface K extends J,I{

}

class A implements K{
    public void add(){
        System.out.println("A+B"+(I.a+J.b));
    }
    public void sub(){
        System.out.println("A+B"+(I.a-J.b));
    }
    public void div(){
        System.out.println("A+B"+(I.a/J.b));
    }
    public void mul(){
        System.out.println("A+B"+(I.a*J.b));
    }
}
public class demo12{
    public static void main(String[] args) {
        demo12 d=new demo12();

        I i=c;
        i.add();
        


    }
}