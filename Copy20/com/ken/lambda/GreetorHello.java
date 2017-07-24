package com.ken.lambda;


/**
 * Write a description of class GreetorHello here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GreetorHello implements Greetor
{
    @Override
    public void perform() {
        System.out.println("Hello World From GreetorHello!");
    }
}
