package com.gzj.six;

public interface Test2 {
    void show();

    default void test() {
        System.out.println(123);
    }
    static void test2(){
        System.out.println("test2");
    }
}
