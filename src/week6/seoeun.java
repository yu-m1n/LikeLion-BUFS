//likelion2024의 하위(자식) 클래스

package week6;

//import week6.likelion2024;

class seoeun extends likelion2024 { //필드
    boolean glass;
    boolean hat;
    boolean have_umbrella;

    seoeun(){ //생성자
        this.glass = true;
        this.hat = true;
        this.have_umbrella = true;
    }
    void wear_hat(){
        System.out.println("모자를 쓰고 있어. 폭");
    }
    void siting(){
        System.out.println("앉아있어. 아이고야");
    }
}
