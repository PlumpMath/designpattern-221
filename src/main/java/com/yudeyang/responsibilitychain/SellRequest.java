package com.yudeyang.responsibilitychain;


/**
 * 每一次的卖货请求
 */
class SellRequest {
    private double amount;
    private String purpose;

    public SellRequest(double amount, String purpose) {
        this.amount = amount;
        this.purpose = purpose;
    }

    public double getAmount() {
        return amount;
    }
    public void setAmount(double amt)  {
        amount = amt;
    }

    public String getPurpose() {
        return purpose;
    }
    public void setPurpose(String reason) {
        purpose = reason;
    }
}