package ch06;

public class ch06_ex_03 {
    public static void main(String[] args) {
        // 객체 배열 안에 객체가 저장되는 것이 아니라 객체의 주소가 저장된다.
        // 사실상 객체 배열은 참조변수들을 하나로 묶은 참조변수 배열인 것.
        Tv[] tvArr = new Tv[3]; // 객체 배열
        // Tv[] tvArr = {new Tv(), new Tv(), new Tv()};

        for(int i = 0; i < tvArr.length; i++) {
            tvArr[i] = new Tv();
        }
    }
}
