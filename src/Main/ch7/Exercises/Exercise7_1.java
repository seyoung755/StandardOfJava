package Main.ch7.Exercises;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for (int i = 1; i < CARD_NUM / 2 + 1; i++) {
            if (i == 1 || i == 3 || i == 8) {
                cards[2 * i - 2] = new SutdaCard(i, true);
                cards[2 * i - 1] = new SutdaCard(i, false);
            } else {
                cards[2 * i - 2] = new SutdaCard(i, false);
                cards[2 * i - 1] = new SutdaCard(i, false);
            }
        }
    }

    void shuffle() {
        for (int i = 0; i < CARD_NUM; i++) {
            int j = (int) (Math.random() * (cards.length - 1));

            SutdaCard tmp = cards[i];
            cards[i] = cards[j];
            cards[j] = tmp;
        }

    }

    SutdaCard pick(int index) {
        return cards[index];
    }

    SutdaCard pick() {
        return cards[(int) (Math.random() * (CARD_NUM - 1))];
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    public SutdaCard() {
        this(1, true);
    }

    public SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    @Override
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

public class Exercise7_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        deck.shuffle();

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ",");
        }
        System.out.println("");
        System.out.println(deck.pick());
        System.out.println(deck.pick(4));
    }
}
