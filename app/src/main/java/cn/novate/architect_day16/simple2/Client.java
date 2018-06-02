package cn.novate.architect_day16.simple2;

import java.lang.reflect.Proxy;


/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/6/2 10:32
 * Version 1.0
 * Params:
 * Description:    动态代理测试代码
*/

public class Client {
    public static void main(String[] args){

        Man man = new Man("Novate") ;


        // 返回的是IBank的一个实例对象，而不在是一个接口，这个对象是由java给我们创建的，最终调用的是jni
        IBank bank = (IBank) Proxy.newProxyInstance(
                IBank.class.getClassLoader() ,   // 类加载器 ClassLoader
                new Class<?>[]{IBank.class},    // 目标接口IBank，这里必须是接口
                new BankInvocationHandler(man)    // InvocationHandler
        );


        // 当调用这个方法时候，会来到BankInvocationHandler的invoke()方法
        bank.applyBank();
        bank.lostBank();
        bank.extraBank();
    }
}
