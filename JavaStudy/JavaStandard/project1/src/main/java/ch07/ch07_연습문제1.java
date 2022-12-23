package ch07;

import java.util.LinkedList;
import java.util.Queue;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for(int i = 0; i < cards.length; i++) {
            if(i == 0 || i == 2 || i == 7)
                cards[i] = new SutdaCard(i + 1, true);
            else
                cards[i] = new SutdaCard(i % 10 + 1, false);
        }
    }

    public void shuffle() {
        for(int i = 0; i < cards.length; i++) {
            int randomIndex = (int)(Math.random() * cards.length);
            SutdaCard tmp;
            tmp = cards[i];
            cards[i] = cards[randomIndex];
            cards[randomIndex] = tmp;
        }
    }

    public SutdaCard pick(int index) {
        return cards[index];
    }

    public SutdaCard pick() {
        return cards[(int)(Math.random() * cards.length)];
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    //info() 대신 Object 클래스의 toString()을 오버라이딩 했다.
    public String toString() {
        return num + (isKwang ? "K" : "");
    }

}

public class ch07_연습문제1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for(int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ",");
        }

        System.out.println();
        System.out.println(deck.pick(0));
    }
}
