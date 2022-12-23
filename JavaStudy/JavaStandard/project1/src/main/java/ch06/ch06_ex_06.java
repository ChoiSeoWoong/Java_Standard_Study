package ch06;

class MyMath {
    long add(long a, long b) {
        long result = a + b;

        return result;
    }

    long subtract(long a, long b) {return a - b;}
    long multiply(long a, long b) {return a * b;}
    double divide(double a, double b) {return a / b;}

    long max(long a, long b) {
        long result = 0;
        result = (a > b) ? a : b;
        return result;
    }

    void printGugudan(int dan) {
        if (!(2 <= dan && dan <= 9)) {
            return;
        }

        for(int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d \n", dan, i, dan * i);
        }
    }

}

public class ch06_ex_06 {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long result = mm.max(3L, 2L);
        long result1 = mm.add(5L, 3L);
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5L, 3L); // double로 자동 형변환

        mm.printGugudan(12);

        System.out.println("max : " + result);
        System.out.println("add(5L, 3L) : " + result1);
        System.out.println("subtract(5L, 3L) : " + result2);
        System.out.println("multiply(5L, 3L) : " + result3);
        System.out.println("divide(5L, 3L) : " + result4);

    }
}
