package Main.ch7.defaultMethodTest;

public class DefaultMethodTest {
    public static void main(String[] args) {
        Child c = new Child();
        c.method1();
        c.method2(); // method2는 Parent, MyInterface에서 이름이 중복된다. 이 경우 디폴트 메서드는 무시되고 조상 클래스의 메서드를 상속받는다.
        MyInterface.staticMethod(); // 인스턴스와 관계가 없기 때문에 독립적이다. 이름이 같아도 문제없다.
        MyInterface2.staticMethod();
    }
}

class Child extends Parent implements MyInterface, MyInterface2 {

    @Override // MyInterface와 MyInterface2 내의 디폴트 메서드가 이름이 중복되므로 반드시 오버라이딩 해야한다.
    public void method1() {
        System.out.println("method1() in Child");
    }
}

class Parent {
    public void method2() {
        System.out.println("method2 in Parent");
    }
}

interface MyInterface {
    // 기본적으로 public 접근제어자가 생략되어있다.
    default void method1() {
        System.out.println("method1 in MyInterface");
    }

    default void method2() {
        System.out.println("method2 in MyInterface");
    }

    static void staticMethod() {
        System.out.println("staticMethod in MyInterface");
    }
}

interface MyInterface2 {
    default void method1() {
        System.out.println("method1 in MyInterface2");
    }

    static void staticMethod() {
        System.out.println("staticMethod in MyInterface2");
    }
}
