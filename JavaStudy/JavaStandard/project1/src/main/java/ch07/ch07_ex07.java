package ch07;

class StaticTest {
    static int width = 200; // 클래스 변수(static 변수)
    static int height = 120; // 클래스 변수(static 변수)

    static { // 클래스 초기화 블럭
        // static 변수의 복잡한 초기화 수행
        System.out.println("Static 클래스 초기화 블럭");
    }
}

final class FinalTest { // 조상이 될 수 없는 클래스
    final int MAX_SIZE = 10; // 값을 변경할 수 없는 멤버 변수(상수)

    final int getMaxSize() { // 오버라이딩할 수 없는 메서드
        final int LV = MAX_SIZE; // 값을 변경할 수 없는 지역변수(상수)
        return MAX_SIZE;
    }
}

public class ch07_ex07 {
    public static void main(String[] args) {
        StaticTest st = new StaticTest();
        FinalTest ft = new FinalTest();

        System.out.println(ft.getMaxSize());
    }
}
