package com.yudeyang.responsibilitychain;

/**
 * 购买能力（购买力）
 */
abstract class PurchasePower {
    /**
     * 每个人最起码的购买力
     */
    protected static final double BASE = 500;
    /**
     * 如果这个人买不起，下一个可能能买起的人
     */
    protected PurchasePower successor;

    /**
     * 最多能出的价
     * @return
     */
    abstract protected double getAllowable();

    /**
     * 用户的职业
     * @return
     */
    abstract protected String getRole();

    public void setSuccessor(PurchasePower successor) {
        this.successor = successor;
    }

    /**
     * 看看自己是否买得起，买不起让下一个买
     * @param request
     */
    public void processRequest(SellRequest request){
        if (request.getAmount() < this.getAllowable()) {
            System.out.println(this.getRole() + " 愿意花 $" + request.getAmount());
        } else {
            if (successor != null) {
                successor.processRequest(request);
            }else{
                System.out.println("估计没有人能买得起了。");
            }
        }
    }
}