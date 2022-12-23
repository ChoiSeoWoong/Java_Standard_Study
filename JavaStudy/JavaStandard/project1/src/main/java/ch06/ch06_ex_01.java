package ch06;

class Tv {
    String color;
    boolean power;
    int channel;

    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}

public class ch06_ex_01 {
    public static void main(String[] args) {
        Tv t; // Tv 인스턴스를 참조하기 위한 변수 t를 선언
        t = new Tv(); // Tv 인스턴스를 생성한다.
        t.channel = 7; // Tv 인스턴스의 멤버변수 channel의 값 7
        t.channelDown(); // Tv 인스턴스의 메서드 channelDown 호출
        System.out.println("현재 채널은 " + t.channel + "입니다.");
    }
}

