package week7;//상속 - 상위(코드의 재사용성을 위해)

class Animal {
    int eyes;
    boolean black_eyes;
    int tail;
    int legs;
    boolean have_voice = false;

    Animal(){
        this.have_voice = true;
        this.tail = 1;
        this.legs = 4;
        this.have_voice = true;
    }
}
