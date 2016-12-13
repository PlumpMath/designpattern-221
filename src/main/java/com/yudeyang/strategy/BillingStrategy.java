package com.yudeyang.strategy;

interface BillingStrategy {
    public double getActPrice(final double rawPrice);
}