package Main.ch7;

public class CastingTest2 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = null;
        FireEngine fe = null;

        car.drive();
        fe = (FireEngine) car; // FireEngine 타입의 참조변수에 car 타입의 참조변수를 다운 캐스팅하여 할당. 컴파일 에러는 생기지 않으나 실행 시 에러가 발생한다.
        // Error : car가 가리키는 인스턴스가 car 타입의 인스턴스이므로, 자식 클래스에서 부모 클래스의 인스턴스에 접근하는 셈이 되어 에러가 발생한다.
        fe.drive();
        car2 = fe;
        car2.drive();
    }
}
