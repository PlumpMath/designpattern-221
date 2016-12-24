package com.yudeyang.responsibilitychain;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 拍卖开始了
 */
class CheckAuthority {
    public static void main(String[] args) {
        ManagerPPower manager = new ManagerPPower();
        DirectorPPower director = new DirectorPPower();
        VicePresidentPPower vp = new VicePresidentPPower();
        PresidentPPower president = new PresidentPPower();
        //先让经理买，经理如果买不起的话让导演买
        manager.setSuccessor(director);
        //导演买不起的话让副总统买
        director.setSuccessor(vp);
        //副总统买不起的话让总统买
        vp.setSuccessor(president);

        // Press Ctrl+C to end.
        try {
            while (true) {
                System.out.println("请输入你要卖的价格");
                System.out.print(">");
                double d = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
                manager.processRequest(new SellRequest(d, "我就想卖东西"));
           }
        } catch(Exception e) {
            System.exit(1);
        }
    }
}