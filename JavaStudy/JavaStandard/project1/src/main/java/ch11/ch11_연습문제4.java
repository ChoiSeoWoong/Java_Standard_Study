package ch11;

import java.util.*;

public class ch11_연습문제4 {
    public static void main(String[] args) {
        Set set = new HashSet();

        for(int i = 0; set.size() < 25; i++) {
            set.add((int)(Math.random() * 30) + 1 + "");
        }

        ArrayList list = new ArrayList(set);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
