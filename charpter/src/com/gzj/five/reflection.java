package com.gzj.five;

import com.gzj.five.domain.User;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.*;
import java.util.*;

public class reflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException, IOException {
        //三种方式获取class对象
        Class<User> userClass = User.class;
        int[] arr = new int[2];
        User user = new User();
        Class<? extends User> aClass = user.getClass();
        System.out.println(arr.getClass().getComponentType());
        Class<?> name = Class.forName("com.gzj.five.domain.User");

        Method method = userClass.getMethod("setAge", Integer.class);
        Method method2 = userClass.getMethod("getAge");
//        method.invoke(userClass,18);
//        System.out.println(method2.invoke(userClass));
        //System.out.println(method.getName());
//        Method[] methods = userClass.getMethods();
//        for(Method m:methods){
//            System.out.println(m.getName());
//        }
//        Constructor<?>[] constructors = userClass.getConstructors();
//        for(Constructor con : constructors){
//            System.out.println(con);
//        }
        Constructor<User> constructor = userClass.getConstructor();
        User user1 = constructor.newInstance();
        method.invoke(user1,18);
//        System.out.println(method2.invoke(user1));
//        System.out.println(user1);

        Constructor<User> constructor1 = userClass.getConstructor(String.class, String.class, Integer.class);
        User user2 = constructor1.newInstance("gzj", "nan", 21);
//        System.out.println(user2);
//        System.out.println(int.class);

        Constructor<?>[] declaredConstructors = userClass.getDeclaredConstructors();
        //show(declaredConstructors);

        Field[] fields = userClass.getDeclaredFields();
        //show(fields);
        //反射可以越过类型检查
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        Class<? extends ArrayList> aClass1 = list.getClass();
//        Method add = aClass1.getMethod("add", Object.class);
//        add.invoke(list,"hello");
//        System.out.println(list);
        Properties p = new Properties();
        FileReader f = new FileReader("charpter\\ref-class.txt");
        p.load(f);

        Set<Object> objects = p.keySet();
        for(Object o: objects){
            System.out.println(o);
        }
        System.out.println(p);
        f.close();

        Method show = userClass.getMethod("show", int.class);
        show.invoke(null,18);//静态方法不需要obj，其次invoke的返回为Object
    }

    public static<T> void show(T[] array){
        for(T t: array){
            System.out.println(t);
        }
    }
    public static<T> void show(Set<T> array){
        for(T t: array){
            System.out.println(t);
        }
    }
}

class ArrCopy{
    public static Object copyOf(Object a , int newLengths) {
        Class<?> aClass = a.getClass();
        if(!aClass.isArray()) {
            return null;
        }
        Class<?> componentType = aClass.getComponentType();
        int length = Array.getLength(a);
        Object o = Array.newInstance(componentType, newLengths);
        System.arraycopy(a,0,o,0,Math.min(length,newLengths));
        return o;
    }
}

