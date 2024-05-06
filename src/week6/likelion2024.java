//부모 클래스 -- seoeun, dongha, dohun

package week6;

class likelion2024 { //필드
    String typing = "타닥타닥";
    boolean wear_shoes = true;
    boolean wear_hoodie = true;
    String hair = "머리카락이 있다";
    int eyes = 2;

    likelion2024(){ //생성자
        //this.typing = "타닥타닥";
        //wear_shoes = true;
        //wear_hoodie = true;
        //hair = "머리카락이 있다";
        //eyes = 2;
    }
    void sleep(){
        System.out.println("잠을 자고 있다. 쿨쿨");
    }
    void walking(){
        System.out.println("걷고 있다. 뚜벅뚜벅");
    }
    void eating(){
        System.out.println("밥을 먹는다. 냠냠");
    }
}
//void print(){
    //System.out.println("타자를 치고 있나요?" + typing);
    //System.out.println("신발을 신었나요?" + wear_shoes);
    //System.out.println("후드티를 입었나요?" + wear_hoodie);
    //System.out.println("머리카락이 있나요?" + hair);
    //System.out.println("눈이 몇 개인가요?" + eyes);
//}