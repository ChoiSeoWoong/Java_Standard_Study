package ch13;

public class ch13_연습문제1 {
    public static void main(String[] args) {
        Runnable r = new Thread1();
        Thread th1 = new Thread(r);

        th1.start();
    }
}

class Thread1 implements Runnable {
    public void run() {
        for(int i = 0; i < 300; i++) {
            System.out.println('-');
        }
    }
}
