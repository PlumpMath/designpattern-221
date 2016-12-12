package com.yudeyang.decorator;

// The interface Coffee defines the functionality of Coffee implemented by decorator
//Coffee接口，需要装饰者去实现，这里面的所有类和子类都需要实现Coffee,这样的话才可以进行层层包装
public interface Coffee {
    public double getCost(); // Returns the cost of the coffee
    public String getIngredients(); // Returns the ingredients of the coffee
}