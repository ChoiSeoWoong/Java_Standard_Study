package ch07;

class Car {
    String color;
    int door;

    void drive() { // 운전하는 기능
        System.out.println("drive, Brrrr ~");
    }

    void stop() { // 멈추는 기능
        System.out.println("stop !!!");
    }
}

class FireEngine extends Car { // 소방차
    void water() { // 물을 뿌리는 기능
        System.out.println("Water !!!");
    }

}

public class ch07_ex10 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe; // car = (Car)fe;에서 형변환이 생략됨. 해당 코드 생략 시 NullPointerException 발생
        //car.water(); 컴파일 에러
        fe2 = (FireEngine)car; // 자손 타입 <- 조상 타입, 형변환 생략 불가
        fe2.water();

        System.out.println(car instanceof FireEngine);
    }
}
