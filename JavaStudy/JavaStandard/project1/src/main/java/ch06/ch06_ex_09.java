package ch06;

class Data3 {
    int x;
}

public class ch06_ex_09 {
    public static void main(String[] args) {
        Data3 d = new Data3();
        d.x = 10;

        Data3 d2 = copy(d);
        System.out.println("d.x = " + d.x);
        System.out.println("d2.x = " + d2.x);

    }

    static Data3 copy(Data3 d) {
        Data3 tmp = new Data3(); // 새로운 객체 tmp 생성
        tmp.x = d.x; // d.x의 값을 tmp.x에 복사한다.

        return tmp; // 복사한 객체의 주소 반환
    }
}
