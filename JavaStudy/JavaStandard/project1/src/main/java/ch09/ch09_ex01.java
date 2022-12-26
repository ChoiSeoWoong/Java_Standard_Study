package ch09;

public class ch09_ex01 {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        if(v1.equals(v2)) {
            System.out.println("v1와 v2는 같습니다.");
        }
        else {
            System.out.println("v1와 v2는 다릅니다.");
        }
    }
}

class Value {
    int value;

    Value(int value) {
        this.value = value;
    }

    public boolean equals(Object obj) {
        if(!(obj instanceof Value)) // obj를 Value로 형변환
            return false;

        Value v = (Value) obj;

        // return this = obj; 주소 비교, 서로 다른 객체는 항상 거짓
        // 참조변수 형변환 전에는 반드시 instanceof로 확인해야 함.
        return this.value == v.value;
    }
}
