package ch07;

public class SmartPhone3 extends Phone3{
    //생성자 선언
    SmartPhone3(String owner) {
        //Phone3 생성자 호출
        super(owner);
    }

    //메소드 선언
    void internetSearch() {
        System.out.println("인터넷 검색을 합니다.");
    }

}
