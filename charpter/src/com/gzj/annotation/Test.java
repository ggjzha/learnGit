package com.gzj.annotation;

import com.gzj.five.domain.User;

/**
 * 测试注解
 * @author gzj
 */
@MyAnnotation(className = "com.gzj.annotation.Test")
public class Test {
    public static void main(String[] args) {
        Class<Test> userClass = Test.class;
        MyAnnotation an = userClass.getAnnotation(MyAnnotation.class);
        System.out.println(an);
        String s = an.className();
        System.out.println(s);
    }
}
