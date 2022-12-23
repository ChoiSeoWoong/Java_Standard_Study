package ch06;

public class ch06_연습문제4 {
    static double getDistance(int x, int y, int x1, int y1) {
        double result;
        result = Math.sqrt(Math.pow((x - x1), 2) + Math.pow((y - y1), 2));
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getDistance(1, 1, 2, 2));
    }
}
