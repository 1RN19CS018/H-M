//method overriding

class Bank{
    void roi(){
        System.out.println("10");
    }
}
class Sbi extends Bank{

}
class Axis extends Bank{
//     void roi(){    //method overriding here
//         System.out.println("15");
//     }
}
class mo{
    public static void main(String[] args) {
        Sbi s=new Sbi();
        s.roi();

        Axis a=new Axis();
        a.roi();

    }
}