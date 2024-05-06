//likelion2024의 하위(자식) 클래스

package week6;

//import week6.likelion2024;

class dongha extends likelion2024 { //필드

    boolean have_ring;
    boolean use_macbook;
    boolean have_cup;

    dongha(){ //생성자
        this.have_ring = true;
        this.use_macbook = true;
        this.have_cup = true;
    }
    void talking(){
        System.out.println("동하는 말한다. \"상속은 어려워\"");
    }
    void cleaning(){
        System.out.println("청소하고 있어. 위이잉");
    }
}
