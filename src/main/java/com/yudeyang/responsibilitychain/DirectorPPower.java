package com.yudeyang.responsibilitychain;

class DirectorPPower extends PurchasePower {
    
    protected double getAllowable(){
        return BASE*20;
    }

    protected String getRole(){
        return "导演";
    }
}