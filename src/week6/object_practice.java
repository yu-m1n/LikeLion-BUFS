package week6;

public class object_practice{
    public static void main(String[] args){
        dohun p1 = new dohun(); //도훈
        System.out.println("도훈이는 --------");
        p1.walking();
        p1.studing();
        p1.eating();

        dongha p2 = new dongha(); //동하
        System.out.println("동하는 --------");
        p2.talking();
        p2.cleaning();
        p2.sleep();

        seoeun p3 = new seoeun(); //서은
        System.out.println("서은이는 --------");
        p3.wear_hat();
        p3.siting();
        p3.eating();
    }
}
