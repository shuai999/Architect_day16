package cn.novate.architect_day16.simple2;

import android.os.Looper;
import android.util.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/6/2 10:36
 * Version 1.0
 * Params:
 * Description:    银行办理业务 - 动态代理 - InvocationHandler
*/

public class BankInvocationHandler implements InvocationHandler{


    // Object就是被代理的对象 Man
    private Object mObject ;
    public BankInvocationHandler(Object object){
        this.mObject = object ;
    }

    /**
     * 执行方法，目标接口调用的方法都会来到这里面
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        System.out.println(method.getName());
//      System.out.println(args.toString());

        System.out.println("开始受理");
        // 调用被代理对象的方法，这里其实调用的就是 man 里面的 applyBank()方法
        Object voidObject = method.invoke(mObject, args);
        System.out.println("操作完毕");

        return voidObject;
    }
}
