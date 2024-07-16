package ch09;

public class Button {
    //정적 중첩 인터페이스
    public static interface ClickListener {
        //추상 메소드
        void onClick();
    }

    //필드
    private Button.ClickListener clickListener;

    //메소드
    public void setClickListener(Button.ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void click() {
        this.clickListener.onClick();
    }
}

