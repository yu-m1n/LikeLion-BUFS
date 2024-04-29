//likelion2024의 하위(자식) 클래스

class seoeun extends likelion2024{ //필드
    boolean glass;
    boolean hat;
    boolean have_umbrella;

    seoeun(){ //생성자
        this.glass = true;
        this.hat = true;
        this.have_umbrella = true;
    }
    void wear_hat(){
        hat = false;

    }
}
