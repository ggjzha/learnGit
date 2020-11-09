package com.gzj.five;

/**
 * 类的加载三个步骤：加载，连接，初始化。
 * 该load类是演示类加载的过程
 * 运行结果：
 * com.gzj.five.LoadGrandson Load
 * com.gzj.five.LoadGrandson LoadChild
 * com.gzj.five.LoadGrandson LoadGrandson
 * finish
 * 显示
 */
class Load{
    public Load() {
        //System.out.println(this.getClass().getName()+" Load");
    }
}

class LoadChild extends Load{
    public LoadChild() {
       // System.out.println(this.getClass().getName()+" LoadChild");
    }
}

class LoadGrandson extends LoadChild{
    public LoadGrandson() {
        System.out.println(this.getClass().getName()+" LoadGrandson");
    }


    public static void main(String[] args) {
        LoadGrandson loadGrandson = new LoadGrandson();

        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);

        System.out.println("finish");
    }
}
