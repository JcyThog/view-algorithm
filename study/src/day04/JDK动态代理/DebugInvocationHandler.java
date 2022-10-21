package day04.JDK动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Description: JDK动态代理类
 * @Author: thog
 * @Date: 2022/10/21 16:48
 */
public class DebugInvocationHandler implements InvocationHandler {

    /**
     * 代理类中的真实对象
     */
    private final Object target;

    public DebugInvocationHandler(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
        System.out.println("调用方法前："+method.getName());
        Object result = method.invoke(target, args);
        System.out.println("调用方法后："+method.getName());
        return result;
    }

}
