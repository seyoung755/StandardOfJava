package Main.ch12;

import java.util.ArrayList;

class Fruit {
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit {
    public String toString() {
        return "Apple";
    }
}

class Grape extends Fruit {
    public String toString() {
        return "Grape";
    }
}

class Toy {
    public String toString() {
        return "Toy";
    }
}


public class FruitBoxEx1 {
    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<>();
        Box<Apple> appleBox = new Box<>();
        Box<Toy> toyBox = new Box<>();
//        Box<Grape> grapeBox = new Box<Apple>(); 타입 불일치로 인한 에러

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple()); // Apple이 Fruit을 상속했으므로 매개변수가 될 수 있다.

        appleBox.add(new Apple());
        appleBox.add(new Apple());
//        appleBox.add(new Toy()); // 담을 수 없음.

        toyBox.add(new Toy());
//        toyBox.add(new Apple());

        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(toyBox);
    }
}

class Box<T> {
    ArrayList<T> list = new ArrayList<>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }
}