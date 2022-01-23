package Main.ch7;

public class BindingTest2 {
    public static void main(String[] args) {
        // 똑같이 Child 타입의 인스턴스를 가리키지만 참조 변수의 타입이 다르다.
        Parent2 p = new Child2();
        Child2 c = new Child2();

        // 부모 클래스와 자식 클래스에 중복 선언된 멤버변수가 없기 때문에 부모 클래스 쪽의 멤버 변수에 접근하였고, 인스턴스 메서드를 오버라이드하지 않았으므로 부모 클래스의 메서드를 호출한다.
        System.out.println("p.x = " + p.x);
        p.method();
        System.out.println("c.x = " + c.x);
        c.method();
    }
}

class Parent2 {
    int x = 100;

    void method() {
        System.out.println("Parent Method");
    }
}

class Child2 extends Parent2 {
}
