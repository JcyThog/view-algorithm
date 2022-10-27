package day05.反射;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description: JDK 实现动态代理
 * @Author: thog
 * @Date: 2022/10/27 14:04
 */
public class DebugInvocationHandler implements InvocationHandler {

    /**
     * 代理类中的真实对象
     */
    private final Object target;

    public DebugInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before method " + method.getName());
        Object result = method.invoke(target, args);
        System.out.println("after method " + method.getName());
        return result;
    }
}
