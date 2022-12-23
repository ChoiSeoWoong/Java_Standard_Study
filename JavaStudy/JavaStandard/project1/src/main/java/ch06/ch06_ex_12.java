package ch06;

class Data_1 {
    int value;
}

class Data_2 {
    int value;

    Data_2(int x) { // 매개 변수가 있는 생성자
        value = x;
    }
}

public class ch06_ex_12 {
    public static void main(String[] args) {
        // 모든 클래스는 반드시 하나 이상의 생성자가 있어야 한다.
        Data_1 d1 = new Data_1(); // Data_1 클래스에는 생성자가 없기 때문에 컴파일러가 자동으로 생성자 추가해줌.
        //Data_2 d2 = new Data_2(); -> 컴파일 에러. why? -> 매개 변수가 있는 생성자로 초기화를 했으나
        // 인자(Argument)에 아무 값도 없기 때문.
        Data_2 d2 = new Data_2(10);
    }
}
