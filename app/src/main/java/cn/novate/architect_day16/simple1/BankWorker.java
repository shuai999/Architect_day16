package cn.novate.architect_day16.simple1;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/6/2 10:11
 * Version 1.0
 * Params:
 * Description:    代理对象 - 银行的工作人员
*/

public class BankWorker implements IBank{

    // 银行工作人员，需要持有被代理的对象（我或者办卡的人）
    private IBank bank ;

    public BankWorker(IBank bank){
        this.bank = bank ;
    }


    @Override
    public void applyBank() {
        System.out.println("开始受理");
        bank.applyBank();
        System.out.println("操作完毕");
    }
}
