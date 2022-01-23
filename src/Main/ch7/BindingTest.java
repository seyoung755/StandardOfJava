package Main.ch7;

public class BindingTest {
    public static void main(String[] args) {
        // 똑같이 Child 타입의 인스턴스를 가리키지만 참조 변수의 타입이 다르다.
        Parent p = new Child();
        Child c = new Child();

        // 부모 클래스와 자식 클래스에 중복 선언된 멤버변수는 참조변수의 타입에 따라 결정되고, 인스턴스 메서드를 오버라이드한 경우 실제 인스턴스의 메서드가 호출된다.
        System.out.println("p.x = " + p.x);
        p.method();
        System.out.println("c.x = " + c.x);
        c.method();
    }
}

class Parent {
    int x = 100;

    void method() {
        System.out.println("Parent Method");
    }
}

class Child extends Parent {
    int x = 200;

    @Override
    void method() {
        System.out.println("Child Method");
    }
}
