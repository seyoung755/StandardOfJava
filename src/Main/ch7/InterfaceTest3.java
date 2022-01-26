package Main.ch7;

class InterfaceTest3 {
    public static void main(String[] args) {
        A a = new A();
        a.methodA();
    }
}

class A {
    void methodA() {
        I i = InstanceManager.getInstance();
        i.methodB();
        System.out.println(i.toString());
    }
}

interface I {
    public abstract void methodB();
}

class B implements I {
    @Override
    public void methodB() {
        System.out.println("methodB in B class");
    }

    @Override
    public String toString() {
        return "class B";
    }
}

class InstanceManager {
    public static I getInstance() {
        return new B(); // 다른 인스턴스로 바꾸려면 여기만 바꾸면 됨 -> 정적 팩토리 메서드
    }
}