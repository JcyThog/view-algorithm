package day01.单例;

/**
 * @Description: 获取 实例懒汉式
 * @Author: thog
 * @Date: 2022/8/3 14:29
 */
public class TestL {

  public static void main(String[] args) {
    SingletonL singleton1 = SingletonL.getInstance();
    SingletonL singleton2 = SingletonL.getInstance();
    System.out.println(singleton1);
    System.out.println(singleton2);
  }
}
