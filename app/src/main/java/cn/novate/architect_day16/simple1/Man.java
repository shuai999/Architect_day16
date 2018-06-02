package cn.novate.architect_day16.simple1;

import java.util.Map;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/6/2 10:13
 * Version 1.0
 * Params:
 * Description:    被代理的对象 - 我（办卡的人）
*/

public class Man implements IBank{

    private String name ;

    public Man(String name){
        this.name = name ;
    }


    /**
     * 我（办卡的人） 自己的操作
     */
    @Override
    public void applyBank() {
        System.out.println("申请办卡");
    }
}
