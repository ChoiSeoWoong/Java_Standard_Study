package ch12;

import java.util.*;

class Product {}
class Tv extends Product {}
class Audio extends Product {}

public class ch12_ex01 {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<Product>();
        ArrayList<Tv> tvList = new ArrayList<Tv>();
        //ArrayList<Product> tvList = new ArrayList<>(Tv); 에러
        //List<Tv> tvList = new ArrayList<Tv>(); Ok. 다형성

        productList.add(new Tv());
        productList.add(new Audio());

        printAll(productList);
    }

    public static void printAll(ArrayList<Product> list) {
        for(Product p : list)
            System.out.println(p);
    }
}
