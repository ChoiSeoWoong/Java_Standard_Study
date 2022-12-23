package ch07;

abstract class Unit2 {
    int x, y;
    abstract void move(int x, int y);
    void stop() {
        System.out.println("멈춥니다.");
    }
}

interface Fightable {
    void move(int x, int y); //public abstract가 생략됨.
    void attack(Fightable f); //public abstract가 생략됨.
}

class Fighter extends Unit2 implements Fightable {
    // 오버라이딩 규칙 : 조상(public)보다 접근제어자가 좁으면 안된다.
    public void move(int x, int y) {
        System.out.println("[" + x + ", " + y + "]로 이동");
    }

    public void attack(Fightable f) {
        System.out.println(f + "를 공격");
    }

    //싸울 수 있는 상대를 불러온다.
    Fightable getFightable() {
        Fighter f = new Fighter();
        return f;
    }
}

public class ch07_ex14 {
    public static void main(String[] args) {
        Unit2 u = new Fighter();
        u.move(100, 200);
        Fightable f = new Fighter();
        f.attack(new Fighter());
        Fighter f2 = new Fighter();
        Fightable f3 = f2.getFightable();
        f3.move(200, 100);
        f3.attack(f2);
    }
}
