package com.yudeyang.strategy;

public class Client {

    public static void main(final String[] arguments) {

        Customer customer = new Customer(new GoldenVipStrategy());
        customer.add(100.00d,10);
        customer.printBill();


        Customer customer2=new Customer(new DiamondVipStrategy());
        customer2.add(100.00d,10);
        customer2.printBill();

    }
}