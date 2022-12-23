package ch05;

public class ex02 {
    public static void main(String[] args) {
//        String[] name = new String[3];
//        name[0] = "Kim";
//        name[1] = "Park";
//        name[2] = "Yi";
//        String[] name = new String[]{"kim", "Park", "Yi"};
        String[] name = {"kim", "park", "yi"};
        System.out.println(name[1].substring(2, 4));
        if (name[1].equals(name[2])) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
