package day01.单例;

/**
 * @Description: 获取 单例 饿汉式
 * @Author: thog
 * @Date: 2022/8/3 14:18
 */
public class TestH {

  public static void main(String[] args) {
    //
    SingletonH singleton = SingletonH.INSTANCE;
    System.out.println(singleton);
  }
}
