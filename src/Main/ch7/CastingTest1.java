package Main.ch7;

public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe; // Car 타입의 참조변수가 FireEngine 타입의 인스턴스를 가리키고 있다. (조상 클래스 -> 자손 클래스)
//        car.water(); Error : Car 타입의 참조변수로는 FireEngine의 멤버에 접근할 수 없다.
        fe2 = (FireEngine) car;
        fe2.water();
    }
}

class Car {
    String color;
    int door;

    void drive() {
        System.out.println("drive, Brrrr~");
    }

    void stop() {
        System.out.println("stop!!!");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("water!!!");
    }
}
