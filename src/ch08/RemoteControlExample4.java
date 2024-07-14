package ch08;

public class RemoteControlExample4 {
    public static void main(String[] args) {
        //인터페이스 변수 선언
        RemoteControl3 rc;

        //Television2 객체를 생성하고 인터페이스 변수에 대입
        rc = new Television2();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        //Audio3 객체를 생성하고 인터페이스 변수에 대입
        rc = new Audio3();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();
    }
}
