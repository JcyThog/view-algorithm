package day05.反射;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Description: 操作
 * @Author: thog
 * @Date: 2022/10/27 14:26
 */
public class OpOb {

  public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
          IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {

    /**
     * 获取TargetObject类的Class对象并且创建TargetObject类实例
     */
    Class<?> targetClass = Class.forName("day05.反射.TargetObject");
    Object target = targetClass.newInstance();

    /**
     * 获取所有类中所有定义的方法
     */
    Method[] methods = targetClass.getDeclaredMethods();
    for (Method method : methods) {
      System.out.println("方法名："+method.getName());
    }

    /**
     * 获取指定方法并调用
     */
    Method publicMethod = targetClass.getDeclaredMethod("publicMethod", String.class);
    publicMethod.invoke(target, "江江");

    /**
     * 获取指定参数并对参数进行修改
     */
    Field field = targetClass.getDeclaredField("value");
    //为了对类中的参数进行修改我们取消安全检查
    field.setAccessible(true);
    field.set(target, "江~");

    /**
     * 调用 private 方法
     */
    Method privateMethod = targetClass.getDeclaredMethod("privateMethod");
    //为了对类中的参数进行修改我们取消安全检查
    privateMethod.setAccessible(true);
    privateMethod.invoke(target);
  }
}
