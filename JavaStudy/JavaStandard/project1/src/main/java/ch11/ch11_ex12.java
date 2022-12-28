package ch11;

import java.util.*;

public class ch11_ex12 {
    public static void main(String[] args) {
        Set set = new TreeSet(); // 범위 검색, 정렬
        //Set set = new HashSet(); // 정렬 필요

        for(int i = 0; i < 6; i++) {
            int num = (int)(Math.random() * 45) + 1;
            set.add(num);
        }

        System.out.println(set);
    }
}
