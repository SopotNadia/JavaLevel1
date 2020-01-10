package collections.main;

import java.util.ArrayList;
import java.util.Collections;

public class Fifth {
    //Не используя вспомогательных объектов, переставить отрицательные
    // элементы данного списка в конец, а положительные — в начало списка.
    static public void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(-3);
        list.add(4);
        list.add(-5);
        list.add(-2);
        list.add(100);
        list.add(-10000);
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
