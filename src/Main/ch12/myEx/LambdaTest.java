package Main.ch12.myEx;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

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

        inventory.sort(Comparator.comparing(Apple::getWeight).reversed());
        inventory.sort(Comparator.comparing(a -> a.getWeight()).reversed());
        inventory.sort(Comparator.comparing((Apple a) -> a.getWeight()))

        inventory.sort(Comparator.<Apple, Integer>comparing(a -> a.getWeight()).reversed());


//        제네릭 타입을 명시하지 않아 a가 Object 타입으로 간주된다.
        inventory.sort(Comparator.comparing(a -> a.getWeight()));
        inventory.sort(Comparator.comparing(a -> ((Apple) a).getWeight()).reversed());

        inventory.sort(Comparator.comparing((Apple i) -> i.getWeight()).reversed());
//        inventory.sort(Comparator.comparing(function));
//        inventory.sort(Comparator.comparing())

        inventory.forEach(System.out::println);
    }
}