package day04.JDK动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Description: 代理对象的工厂类 JDK代理：只能代理实现了接口的类
 * @Author: thog
 * @Date: 2022/10/21 17:04
 */
public class JdkProxyFactory {

  /**
   * @description 主要通过Proxy.newProxyInstance（）方法获取某个类的代理对象
   * @param target
   * @return 代理对象
   */
  public static Object getProxy(Object target) {
    return Proxy.newProxyInstance(
        target.getClass().getClassLoader(), // 目标类的类加载
        target.getClass().getInterfaces(), // 代理需要实现的接口，可指定多个
        new DebugInvocationHandler(target) // 代理对象对应的自定义
        );
  }

  public static void main(String[] args) {
    SmsService smsService = (SmsService) JdkProxyFactory.getProxy(new SmsServiceImpl());
    smsService.send("Java");
  }
}
