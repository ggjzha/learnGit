package com.gzj.nine;

import java.util.LinkedList;
import java.util.ListIterator;

public class Linked {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();

//        LinkedList<String> list2 = new LinkedList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        //System.out.println(list1);

        ListIterator<String> stringListIterator = list1.listIterator();
        String next = stringListIterator.next();
        stringListIterator.next();
        System.out.println(next);//a
        String previous = stringListIterator.previous();
        System.out.println(previous);//a
        stringListIterator.remove();
        System.out.println(list1);
        System.out.println("".equals(null));
    }
}
