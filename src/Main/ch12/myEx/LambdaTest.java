package Main.ch12.myEx;

import java.io.Serializable;
import java.util.*;

class Apple {
    private final String color;
    public final Integer weight;

    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return this.color;
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}


public class LambdaTest {

    static <T> T pick(T a1, T a2) {
        return a2;
    }

    public static void main(String[] args) {

        Serializable s = pick("s", new ArrayList<String>());

        String pick = pick("d", "s");

//        Function<Object, Integer> function = a -> a.getWeight();
//        // 무게 내림차순 정렬
//        inventory.sort(Comparator.comparing(function).reversed());
        List<Apple> inventory = Arrays.asList(new Apple("a", 50), new Apple("b", 50), new Apple("c", 100));

        Comparator<Apple> reversed = Comparator.comparing(a -> a.getWeight());
        inventory.sort(Comparator.comparing(Apple::getWeight).reversed());
        //        제네릭 타입을 명시하지 않아 a가 Object 타입으로 간주된다.
//        inventory.sort(Comparator.comparing(a -> a.getWeight()).reversed());

        // 되는 코드들
        inventory.sort(Comparator.comparing((Apple a) -> a.getWeight()).reversed()); // 람다식 내부에 explicit type 선언
        inventory.sort(Comparator.<Apple, Integer>comparing(a -> a.getWeight()).reversed()); // 제네릭 메소드인 comparing의 explicit type 선언
        inventory.sort(Comparator.comparing(a -> ((Apple) a).getWeight()).reversed()); // Object a 를 Apple로 다운캐스팅
        inventory.sort(Collections.reverseOrder(Comparator.comparing(a -> a.getWeight()))); // receiver인 reversed()를 사용하지 않는 방법.


        inventory.forEach(System.out::println);
    }
}