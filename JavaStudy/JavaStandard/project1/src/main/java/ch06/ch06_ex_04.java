package ch06;

class Variables {
    int iv; // 인스턴스 변수, 인스턴스를 선언해야 사용이 가능하다.
    static int cv; // static 변수, 클래스 변수

    void method() {
        int lv = 0; // 함수 내에서 선언된 지역 변수, 메서드 영역 내에서만 사용 가능하다.
    }
}

public class ch06_ex_04 {
}
