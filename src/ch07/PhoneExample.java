package ch07;

public class PhoneExample {
    public static void main(String[] args) {
        //Phone3 phone = new Phone(); 사용 불가능

        SmartPhone3 smartPhone = new SmartPhone3("홍길동");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
