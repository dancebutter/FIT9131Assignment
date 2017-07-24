package com.ken.lambda;


/**
 * Write a description of class App here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class App
{
    public static void main(String[] args) {
        Greetor helloGreetor = new GreetorHello();
        helloGreetor.perform();
        
        Greetor anonymousGreetor = new Greetor() {
            @Override
            public void perform() {
                System.out.println("Hello World From AnonymousGreetor!");
            }
        };
        anonymousGreetor.perform();
        
        Greetor lambdaGreetor = () -> {
            System.out.println("Hello World From LambdaGreetor!");
        };
        lambdaGreetor.perform();
        
    }
}
