package ch07;

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    String getLocation() {
        return "x : " + x + ", y : " + y;
    }

    // Object 클래스의 toString 메서드를 오버라이딩
    public String toString() {
        return "x : " + x + ", y : " + y;
    }
}

//class Point3D extends Point {
//    int z;
//
//    // 조상의 getLocation()을 오버라이딩
//    String getLocation() {
//        return "x : " + x + ", y : " + y + ", z : " + z;
//    }
//}

public class ch07_ex03 {
    public static void main(String[] args) {
        Point p = new Point(2, 3);

        //System.out.println(p.getLocation());
        System.out.println(p);

    }
}
