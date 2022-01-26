package Main.ch7;

public class InnerEx3 {
    private int outerIv = 0;
    static int outerCv = 0;

    class InstanceInner {
        int iiv = outerIv; // 인스턴스 클래스는 외부 클래스의 private 멤버에도 접근이 가능하다.
        int iiv2 = outerCv;
    }

    static class StaticInner {
        //        int siv = outerIv; // 스태틱 클래스에서는 외부 클래스의 static 멤버에만 접근이 가능하다.
        InnerEx3 i = new InnerEx3(); // 스태틱 클래스에서 외부 클래스의 인스턴스 멤버에 접근하려면 객체를 생성해야 한다.
        int siv = i.outerIv;
        static int scv = outerCv;
    }

    void myMethod() {
        int lv = 0; // 실제로는 final 이 생략되어있다. Java 1.8부터 바뀜
        final int LV = 0;

        class LocalInner {
            int liv = outerIv;
            int liv2 = outerCv;

            int liv3 = lv; // 원래는 외부 클래스의 지역변수는 final이 붙은 변수만 접근 가능하지만, 실제로는 final이 생략되어 있으므로 에러가 아니다.
            int liv4 = LV;
        }
    }
}
