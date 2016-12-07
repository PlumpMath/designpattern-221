package com.yudeyang.singleton;

/**
 * 单例模式，在一个jvm中是可以保证唯一的，其最主要的特点是构造方法是pirvate,
 * 既然从外部无法创建本类的对象，只能从内部来进行创建.
 * 以下就是一个简单的单例，具体到实际应用中的话会有getInstance2的方式，为了懒实例化
 * 此外，考虑到线程安全性，可以使用getInstance3的方式
 * Created by deyang on 2016/12/6.
 */
public class Singleton {

    private static Singleton ourInstance = new Singleton();

    public static Singleton getInstance() {
        return ourInstance;
    }


    /**
     * 懒实例化
     * @return
     */
    public static Singleton getInstance2() {

        if(ourInstance!=null){
            return ourInstance;
        }else{
            return  new Singleton();
        }

    }



    /**
     * 懒实例化,线程安全
     * @return
     */
    public static Singleton getInstance3() {

        if(ourInstance!=null){
            return ourInstance;
        }else{
            synchronized (Singleton.class){
                if(ourInstance==null){
                    return new Singleton();
                }else{
                    return ourInstance;
                }
            }
        }

    }


    private Singleton() {
    }
}
