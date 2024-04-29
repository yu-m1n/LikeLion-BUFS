//라쿤 객체 생성하기

class raccoon extends Animal{ //필드(여기에만 있는건 독립적 특징) -- Animal 필드에 공통된 특징도 포함
    boolean pattern;
    boolean is_it_racoon;
    int tail;
    int ears;
    int foot;
    int mouth;

    raccoon(){ //생성자 -- class 이름과 동일하게
        this.black_eyes = true;
        this.pattern = true;
        this.is_it_racoon = true;
        this.tail = 1;
        this.ears = 2;
        this.foot = 4;
        this.mouth = 1;
    }
    //void print{ //
}

