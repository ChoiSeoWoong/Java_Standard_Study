package ch06;

class MyPoint {
    int x;
    int y;

    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double getDistance(int x1, int y1) {
        double result;
        result = Math.sqrt(Math.pow((x - x1), 2) + Math.pow((y - y1), 2));
        return result;
    }
}

public class ch06_연습문제5 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(1, 1);

        System.out.println(p.getDistance(2, 2));
    }
}
