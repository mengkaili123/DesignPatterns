package com.designpatterns.sington;

import java.util.concurrent.atomic.AtomicLong;

public class IdGenerator {

    // 饿汉式
//    private AtomicLong id = new AtomicLong(0);
//    private static final IdGenerator instance = new IdGenerator();
//    private IdGenerator() {}
//    public static IdGenerator getInstance() {
//        return instance;
//    }
//    public long getId() {
//        return id.incrementAndGet();
//    }

    // 懒汉式
//    private AtomicLong id = new AtomicLong(0);
//    private static IdGenerator instance;
//    private IdGenerator() {}
//    public static synchronized IdGenerator getInstance() {
//        if (instance == null) {
//            instance = new IdGenerator();
//        }
//        return instance;
//    }
//    public long getId() {
//        return id.incrementAndGet();
//    }

    // 双重检测
    private AtomicLong id = new AtomicLong(0);
    private static IdGenerator instance;
    private IdGenerator() {}
    public static IdGenerator getInstance() {
        if (instance == null) {
            synchronized(IdGenerator.class) { // 此处为类级别的锁
                if (instance == null) {
                    instance = new IdGenerator();
                }
            }
        }
        return instance;
    }
    public long getId() {
        return id.incrementAndGet();
    }

    // 静态内部类
//    private AtomicLong id = new AtomicLong(0);
//    private IdGenerator() {}
//
//    private static class SingletonHolder{
//        private static final IdGenerator instance = new IdGenerator();
//    }
//
//    public static IdGenerator getInstance() {
//        return SingletonHolder.instance;
//    }
//
//    public long getId() {
//        return id.incrementAndGet();
//    }

}
