package ch09;

public class AExample4 {
    public static void main(String[] args) {
        //B 객체 생성 및 인스턴스 필드 및 메소드 사용
        A4.B b = new A4.B();
        System.out.println(b.field1);
        b.method1();

        //B 클래스의 정적 필드 및 메소드 사용
        System.out.println(A4.B.field2);
        A4.B.method2();
    }
}
