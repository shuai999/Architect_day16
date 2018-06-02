package cn.novate.architect_day16.simple1;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/6/2 10:17
 * Version 1.0
 * Params:
 * Description:
*/

public class Client {
    public static void main(String[] args){

        Man man = new Man("Novate") ;
        BankWorker bankWorder = new BankWorker(man) ;
        bankWorder.applyBank();
    }
}
