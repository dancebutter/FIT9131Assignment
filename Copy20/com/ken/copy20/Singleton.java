package com.ken.copy20;

public class Singleton{
    private static Singleton instance;
    private Singleton() {
        System.out.println("Create Singleton");
    }
    
    public static Singleton getInstance() {
        if(instance == null) {
            synchronized(Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            System.out.println("In Thread #" + i);
            new Thread(){
                @Override
                public void run() {
                    Singleton.getInstance();
                }
            }.start();
        }
    }
}