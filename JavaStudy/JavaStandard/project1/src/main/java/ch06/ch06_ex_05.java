package ch06;

class Card {
    String kind; // 무늬 - 개별 속성
    int number; // 숫자 - 개별 속성

    static int width = 100; // 너비 - 공통 속성
    static  int height = 250; // 높이 - 공통 속성
}

public class ch06_ex_05 {
    public static void main(String[] args) {
        System.out.println("카드 너비 : " + Card.width); // 인스턴스 생성 없이 사용 가능
        System.out.println("카드 높이 : " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며 크기는 (" + c1.width +
                ", " + c1.height + ")");
        System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며 크기는 (" + c2.width +
                ", " + c2.height + ")");

        System.out.println("c1의 너비와 높이를 각각 50, 80으로 변경합니다.");
        c1.width = 50;
        c1.height = 80; // 클래스 변수 값 변경

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며 크기는 (" + c1.width +
                ", " + c1.height + ")");
        System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며 크기는 (" + c2.width +
                ", " + c2.height + ")");

        // Card.width, c1.width, c2.width는 모두 같은 저장공간을 참조한다. 따라서 항상 같은 값.
        // 따라서 static 변수를 사용할 경우 클래스의 이름을 통해 속성을 사용하는 것이 좋다.
    }
}
