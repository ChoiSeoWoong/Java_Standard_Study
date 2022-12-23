package ch06;

public class ch06_ex_02 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();

        System.out.println("t1의 채널은 " + t1.channel + "입니다.");
        System.out.println("t2의 채널은 " + t2.channel + "입니다.");

        t1.channel = 7;
        System.out.println("t1의 채널을 7로 변경하였습니다.");

        System.out.println("t1의 채널은 " + t1.channel + "입니다.");
        System.out.println("t2의 채널은 " + t2.channel + "입니다.");

        // 참조변수 t2에 t1을 저장. 기존 t2의 데이터들은 가비지 컬렉터가 알아서 지워준다.
        t2 = t1;
        System.out.println("t1의 채널은 " + t1.channel + "입니다.");
        System.out.println("t2의 채널은 " + t2.channel + "입니다.");


    }
}
