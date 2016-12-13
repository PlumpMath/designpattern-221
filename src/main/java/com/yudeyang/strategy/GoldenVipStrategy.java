package com.yudeyang.strategy;

// GoldenVip strategy (90% price)
class GoldenVipStrategy implements BillingStrategy {

    @Override
    public double getActPrice(final double rawPrice) {
        return rawPrice*0.9;
    }

}