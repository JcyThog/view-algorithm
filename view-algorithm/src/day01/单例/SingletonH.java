package day01.单例;

/**
 * @Description: 单例 实例化饿汉式
 * @Author: thog
 * @Date: 2022/8/3 14:16
 */
public class SingletonH {

    public static final SingletonH INSTANCE = new SingletonH();
    private SingletonH() {

    }
}
