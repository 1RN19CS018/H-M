//this, super 
class P{
    int money=10000;
    String car="BMW";
    private String newcar="Benz";
    void use(){
        System.out.println("Money: "+money);
    }

}
class C extends P{
    int money=10;
    void use(int money){
    System.out.println("Parent Money: "+super.money);//super keyword to get value from parents class
    System.out.println("argument money: "+this.money);//this keyword to override the argument passed

    System.out.println("Car: "+car);
    //System.out.println("New Car: "+newcar);
    }

}

public class singleinherit{

    public static void main(String args[]){
        C c=new C();
        c.use(111);
        
        P p=new P();
        p.use();
    }
}