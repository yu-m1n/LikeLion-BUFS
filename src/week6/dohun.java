//likelion2024의 하위(자식) 클래스
package week6;

//import week6.likelion2024;

class dohun extends likelion2024 { //필드
    boolean glass;
    boolean have_earphone;
    boolean have_mouse;

    dohun(){ //생성자
        glass = true; //this 생략해도 O
        this.have_earphone = true;
        //this.have_mouse = true;
    }
    void walking(){
        System.out.println("걷고있어. 찹찹");
    }
    void studing(){
        System.out.println("공부하고 있어. 사각사각");
    }
}
