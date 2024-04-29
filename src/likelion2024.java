//부모 클래스 -- seoeun, dongha, dohun

import java.sql.SQLOutput;

class likelion2024 { //필드
    String typing;
    boolean wear_shoes;
    boolean wear_hoodie;
    String hair;
    int eyes;

    likelion2024(){ //생성자
        this.typing = "타닥타닥";
        this.wear_shoes = true;
        this.wear_hoodie = true;
        this.hair = "머리카락이 있다";
        this.eyes = 2;
    }
    void sleep(){
        System.out.println("쿨쿨");
    }
    void walking(){
        System.out.println("뚜벅뚜벅");
    }
    void eating(){
        System.out.println("냠냠");
    }
}

//리턴 자료형 메서드명 (입력 자료형 매개 변수, 입력 자료형 매개 변수) {
//	...
//	return 리턴값;
//}