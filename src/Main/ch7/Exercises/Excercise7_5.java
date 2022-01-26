package Main.ch7.Exercises;

class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv extends Product {

    Tv() {
        super(10);
    }

    public String toString() {
        return "TV";
    }
}

public class Excercise7_5 {
    public static void main(String[] args) {
        Tv t = new Tv();
    }
}
