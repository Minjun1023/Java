package ch07;

public abstract class Phone3 {
    //필드 선언
    String owner;

    //생성자 선언
    Phone3(String owner) {
        this.owner = owner;
    }

    //메소드 선언
    void turnOn() {
        System.out.println("폰 전원을 켭니다.");
    }

    void turnOff() {
        System.out.println("폰 전원을 끕니다.");
    }
}
