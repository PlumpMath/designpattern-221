package com.yudeyang.responsibilitychain;

class ManagerPPower extends PurchasePower {
    
    protected double getAllowable(){
        return BASE*10;
    }

    protected String getRole(){
        return "经理";
    }
}