package ch06;

public class ch06_ex_15 {
    static {
        System.out.println("static {}"); // 클래스 초기화 블럭
    }

    {
        System.out.println("{}"); // 인스턴스 초기화 블럭
    }

    public ch06_ex_15() {
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        System.out.println("ch06_ex_15 bt = new ch06_ex_15();");
        ch06_ex_15 bt = new ch06_ex_15();

        System.out.println("ch06_ex_15 bt2 = new ch06_ex_15();");
        ch06_ex_15 bt2 = new ch06_ex_15();
    }
}
