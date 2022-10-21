package day04.JDK动态代理;

import java.lang.reflect.Method;

public interface InvocationHandler {

    /**
     * 当你使用代理对象调用方法的时候实际会调用到这个方法
     */
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
