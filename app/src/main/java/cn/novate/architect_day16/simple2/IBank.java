package cn.novate.architect_day16.simple2;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/6/2 10:10
 * Version 1.0
 * Params:
 * Description:    银行办理业务 - 目标接口
*/

public interface IBank {

    /**
     * 申请办卡
     */
    void applyBank() ;

    /**
     * 挂失
     */
    void lostBank() ;

    /**
     * 额外的业务
     */
    void extraBank() ;
}
