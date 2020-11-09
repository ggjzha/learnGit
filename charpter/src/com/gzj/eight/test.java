package com.gzj.eight;

public class test {
    public static void main(String[] args) {
        String[] strings = get(String[]::new, "a", "b", "c");
        for (String s:
             strings) {
            System.out.println(s);
        }
        System.out.println(strings);
    }

    public static <T>  T[] get(GetArray<T> getArray,T... a){
        T[] array = getArray.getArray(a.length);
        for(int i = 0;i<a.length;i++){
            array[i]=a[i];
        }
        return array;
    }
}
