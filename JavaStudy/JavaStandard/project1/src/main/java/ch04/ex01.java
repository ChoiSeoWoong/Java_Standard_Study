package ch04;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rank = sc.next();

        switch (rank) {
            case "A" :
                System.out.println("A입니다.");
                break;

            default:
                System.out.println("그냥그냥");
        }
    }
}
