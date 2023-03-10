package ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ch11_연습문제2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student("홍길동", 1, 3, 100, 100, 100));
        list.add(new Student("남궁성", 1, 1, 90, 70, 80));
        list.add(new Student("김자바", 1, 2, 80, 80, 90));
        list.add(new Student("이자바", 2, 1, 70, 90, 70));
        list.add(new Student("안자바", 2, 2, 60, 100, 80));

        Collections.sort(list, new BanNoAscending());
        Iterator it = list.iterator();

        while(it.hasNext())
            System.out.println(it.next());
    }
}

class BanNoAscending implements Comparator {
    public int compare(Object o1, Object o2){
        o1 = (Student)o1;
        o2 = (Student)o2;

        if(((Student) o1).ban < ((Student) o2).ban) {
            return -1;
        }

        else if(((Student) o1).ban > ((Student) o2).ban) {
            return 1;
        }

        else {
            if(((Student) o1).no < ((Student) o2).no) {
                return -1;
            }

            else if(((Student) o1).no > ((Student) o2).no) {
                return 1;
            }

            else {
                return 0;
            }
        }
    }
}
