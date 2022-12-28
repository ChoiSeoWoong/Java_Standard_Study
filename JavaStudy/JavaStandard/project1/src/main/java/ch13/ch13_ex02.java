package ch13;

public class ch13_ex02 {
    public static void main(String[] args) {
        // 싱글 쓰레드 예제

        long startTime = System.currentTimeMillis();

        for(int i = 0; i < 300; i++) {
            System.out.printf("%s", new String("-"));
        }

        System.out.print("소요 시간 : " + (System.currentTimeMillis() - startTime));

        for(int i = 0; i < 300; i++) {
            System.out.printf("%s", new String("ㅣ"));
        }

        System.out.println("소요 시간2 : " + (System.currentTimeMillis() - startTime));
    }
}
