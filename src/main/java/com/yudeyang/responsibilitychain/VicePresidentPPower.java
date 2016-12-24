package com.yudeyang.responsibilitychain;

class VicePresidentPPower extends PurchasePower {
    
    protected double getAllowable(){
        return BASE*40;
    }

    protected String getRole(){
        return "副总统";
    }
}