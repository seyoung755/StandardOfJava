package Main.ch6;

public class CallStackTest2 {
    public static void main(String[] args) {
        System.out.println("main이 시작됨");
        firstMethod();
        System.out.println("main 종료됨");
    }

    static void firstMethod() {
        System.out.println("firstMethod 시작됨");
        secondMethod();
        System.out.println("firstMethod 종료됨");
    }

    static void secondMethod() {
        System.out.println("secondMethod 시작됨");
        System.out.println("secondMethod 종료됨");
    }
}
