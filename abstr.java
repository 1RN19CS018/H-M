abstract class Bank{
    abstract void Atm();

    
    abstract payment();

    
}
class Axis extends Bank{
    Atm(){
        System.out.println("no implemented Abstract method");
    }
    payment(){
        System.out.println("no implemented Abstract method");
    }
   // abstract void xyz();
    
}
class SBI extends Axis{
    void xyz()
    {
        System.out.println("gx");
    }
}
public class abstr{
    public static void main(String[] args) {
        System.out.println(" Hi Abstract Method");
    }
}