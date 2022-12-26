package ch09;

public class ch09_연습문제4 {
    public static boolean contains(String src, String target) {
        return src.contains(target);
    }

    public static void main(String[] args) {
        System.out.println(contains("12345", "23"));
        System.out.println(contains("12345", "67"));
    }
}
