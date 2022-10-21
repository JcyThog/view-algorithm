package day04.CGLIB动态代理;

import javax.security.auth.callback.Callback;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public interface MethodInterceptor extends Callback {

    // 拦截被代理类中的方法 todo
    public static Object intercept(Object obj, Method method, Object[] args, Proxy proxy) throws Throwable {
        return null;
    }
}
