package ch13;

public class ch13_ex06 implements Runnable{
    static boolean autoSave = false;

    public static void main(String[] args) {
        Thread t = new Thread(new ch13_ex06());
        t.setDaemon(true); // 이 부분이 없으면 종료되지 않는다.
        t.start();
        // 메인 스레드
        for(int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}

            System.out.println(i);
            if(i == 5) autoSave = true;
        }

        System.out.println("프로그램을 종료합니다.");
    }
    // 데몬 스레드
    public void run() {
        while(true) {
            try {
                Thread.sleep(3 * 1000); // 3초마다
            } catch (InterruptedException e) {}

            if(autoSave) autoSave();
        }
    }

    public void autoSave() {
        System.out.println("작업 파일이 자동 저장되었습니다.");
    }
}
