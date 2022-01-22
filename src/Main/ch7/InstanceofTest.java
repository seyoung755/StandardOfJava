package Main.ch7;

import org.omg.CORBA.Object;

public class InstanceofTest {
    public static void main(String[] args) {
        FireEngine fe = new FireEngine();

        if (fe instanceof FireEngine) {
            System.out.println("This is a FireEngine instance");
        }

        if (fe instanceof Car) {
            System.out.println("This is a Car instance");
        }

        if (fe instanceof Object) {
            System.out.println("This is a Object instance");
        }

        System.out.println(fe.getClass().getSimpleName()); // getName은 클래스패스 이하 패키지 경로까지 표시되고 simpleName은 클래스 이름만 표시
    }
}
