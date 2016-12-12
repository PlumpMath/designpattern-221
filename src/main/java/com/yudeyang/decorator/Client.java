package com.yudeyang.decorator;

/**
 * 代码来自维基百科https://en.wikipedia.org/wiki/Decorator_pattern
 * Created by deyang on 2016/12/12.
 */
public class Client {

    public static void printInfo(Coffee c) {
        System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getIngredients());
    }

    public static void main(String[] args) {
        //先磨一杯咖啡
        Coffee c = new SimpleCoffee();
        printInfo(c);
        //加点牛奶
        c = new WithMilk(c);
        printInfo(c);
        //加点糖沫
        c = new WithSprinkles(c);
        printInfo(c);
    }
}
