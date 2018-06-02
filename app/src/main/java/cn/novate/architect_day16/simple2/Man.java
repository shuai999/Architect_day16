package cn.novate.architect_day16.simple2;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/6/2 10:13
 * Version 1.0
 * Params:
 * Description:    被代理的对象 - 我（办卡的人）
 */

public class Man implements IBank {
    private String name;

    public Man(String name){
        this.name = name;
    }

    /**
     * 自己的一些操作
     */
    @Override
    public void applyBank() {
        System.out.println(name + " 申请办卡");
    }

    @Override
    public void lostBank() {
        System.out.println(name + " 申请挂失");
    }

    @Override
    public void extraBank() {
        System.out.println(name + " 额外业务");
    }
}
