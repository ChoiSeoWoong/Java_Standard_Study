package ch07;

class MyParent {
    private int prv; // 같은 클래스
    int dft; // 같은 패키지
    protected int prt; // 같은 패키지 + 자손(패키지)
    public int pub; // 접근 제한 없음.

    public void printMembers() {
        System.out.println(prv); // OK
        System.out.println(dft); // OK
        System.out.println(prt); // OK
        System.out.println(pub); // OK
    }
}

public class ch07_ex09 {
    public static void main(String[] args) {
        MyParent p = new MyParent();
        //System.out.println(p.prv); 에러
        System.out.println(p.dft); //OK
        System.out.println(p.prt); //OK
        System.out.println(p.pub); //OK
    }
}
