package com.gzj.six;

//import com.gzj.six.impl.TestImpl;

import java.util.Arrays;

public class Lambda {
    public static void main(String[] args) {
        test((a)->{
            System.out.println(a);
//            System.out.println("456");
        });
        test(System.out::println);
//        TestImpl test = new TestImpl();
//        test.show();
//        test.test();
//        Test2.test2();

    }
    public static void test(Test test){
        test.show(123);
    }
}
