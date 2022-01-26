package Main.ch7;

class Outer {
    class InstanceInner {
        int iv = 100;
    }

    static class StaticInner {
        int iv = 200;
        static int cv = 300;
    }

    void myMethod() {
        class LocalInner {
            int iv = 400;
        }
    }
}

public class InnerEx4 {
    public static void main(String[] args) {
        Outer oc = new Outer();
        Outer.InstanceInner ii = oc.new InstanceInner();

        System.out.println("ii.iv : " + ii.iv);

        System.out.println("Outer.StaticInner.cv : " + Outer.StaticInner.cv); // 스태틱 클래스의 스태틱 멤버에는 접근이 가능하다.

        // 스태틱 내부 클래스의 인스턴스는 외부 클래스의 인스턴스를 생성하지 않아도 된다.
        Outer.StaticInner si = new Outer.StaticInner();
        // 스태틱 내부 클래스의 인스턴스 필드는 인스턴스를 통해서 접근해야 한다.
        System.out.println("si.iv : " + si.iv);
    }
}


