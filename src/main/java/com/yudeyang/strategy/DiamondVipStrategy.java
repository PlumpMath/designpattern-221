package com.yudeyang.strategy;

// Strategy for DiamondVip (80% discount)
class DiamondVipStrategy implements BillingStrategy {

    @Override
    public double getActPrice(final double rawPrice) {
        return rawPrice*0.8;
    }

}