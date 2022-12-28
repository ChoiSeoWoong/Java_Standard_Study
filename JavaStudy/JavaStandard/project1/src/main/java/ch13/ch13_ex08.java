package ch13;

public class ch13_ex08 {
    public static void main(String[] args) {
        Runnable r = new RunnableEx12();
        new Thread(r).start();
        new Thread(r).start(); // ThreadGroup에 의해 참조되므로 gc 대상이 아니다.
    }
}

class Account {
    private int balance = 1000; // private으로 해야 동기화의 의미가 있다.

    public int getBalance() {
        return balance;
    }

    public synchronized void withDraw(int money) {
        if(balance >= money) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
            balance -= money;
        }
    }
}

class RunnableEx12 implements Runnable {
    Account acc = new Account();

    public void run() {
        while(acc.getBalance() > 0) {
            // 100, 200, 300 중의 한 값을 임의로 선택해서 출금(withDraw)
            int money = (int)(Math.random() * 3 + 1) * 100;
            acc.withDraw(money);
            System.out.println("balance : " + acc.getBalance());
        }
    }
}
