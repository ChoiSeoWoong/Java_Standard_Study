package ch06;

class MyMath3 {
    int add(int a, int b) {
        System.out.println("int add(int a, int b) - ");
        return a + b;
    }
    // 메서드 오버 로딩
    long add(int a, long b) {
        System.out.println("long add(long a, long b) - ");
        return a + b;
    }

    long add(long a, int b) {
        System.out.println("long add(long a, int b) - ");
        return a + b;
    }

    long add(long a, long b) {
        System.out.println("long add(long a, long b) - ");
        return a + b;
    }

    int add(int[] a) {
        System.out.println("int add(int[] a) - ");
        int result = 0;

        for(int i = 0; i < a.length; i++) {
            result += a[i];
        }

        return result;
    }
}

public class ch06_ex_11 {
    public static void main(String[] args) {
        MyMath3 mm = new MyMath3();

        //println 메서드보다 mm.add() 메서드가 먼저 출력
        System.out.println("mm.add(3, 3) 결과 : " + mm.add(3, 3));
        System.out.println("mm.add(3L, 3) 결과 : " + mm.add(3L, 3));
        System.out.println("mm.add(3, 3L) 결과 : " + mm.add(3, 3L));
        System.out.println("mm.add(3L, 3L) 결과 : " + mm.add(3L, 3L));

        int[] a = {100, 200, 300};
        System.out.println("mm.add(a) 결과 : " + mm.add(a));
    }
}
