package ch14;

public class ch14_ex01 {
    public static void main(String[] args) {
//        MyFunction f = new MyFunction() {
//            @Override
//            public int max(int a, int b) { // 오버라이딩 - 접근 제어자는 좁게 못바꾼다.
//                return a > b ? a : b;
//            }
//        };

        // 람다식(익명 객체)를 다루기 위한 참조변수의 타입은 함수형 인터페이스로 한다.
        MyFunction f = (a, b) -> a > b ? a : b;

        int value = f.max(3, 5);
        System.out.println(value);
    }
}

@FunctionalInterface
interface MyFunction {
    int max(int a, int b);
}
