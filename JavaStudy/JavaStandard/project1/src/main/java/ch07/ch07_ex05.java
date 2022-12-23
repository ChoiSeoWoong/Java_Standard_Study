package ch07;

class Point2 {
    int x, y;

    Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Point3D extends Point2 {
    int z;

    Point3D(int x, int y, int z) {
        super(x, y); // Point2(int x, int y)를 호출, super(x, y)를 통해 조상의 생성자를 호출하지 않으면 에러 발생.
        this.z = z;
    }

}

public class ch07_ex05 {
    public static void main(String[] args) {
        Point3D p = new Point3D(1, 2,3);
        System.out.println("x = " + p.x + ", y = " + p.y + ", z = " + p.z);
    }
}
