package day01.单例;

/**
 * @Description: 实例懒汉式
 * @Author: thog
 * @Date: 2022/8/3 14:26
 */
public class SingletonL {
  private static SingletonL instance;

  public SingletonL() {}

  // 线程安全的创建
//  public static SingletonL getInstance() {
//    if (instance == null) {
//      synchronized (SingletonL.class) {
//        if (instance == null) {
//          try {
//            Thread.sleep(1000);
//          } catch (InterruptedException e) {
//            e.printStackTrace();
//          }
//          instance = new SingletonL();
//        }
//      }
//    }
//    return instance;
//  }

  //静态内部类创建（线程安全）
  //在内部类被加载和初始化时，才创建INSTANCE
  //静态内部类不会自动随着外部类的加载和初始化而初始化
  //它是要单独去加载和初始化的（在第一次使用的时候）
  //这样保证了延迟创建
  //因为是在内部类加载和初始化时创建的 因此是线程安全的
  private static class Inner {
    private static final SingletonL INSTANCE = new SingletonL();
  }
  public static SingletonL getInstance(){
    return Inner.INSTANCE;
  }

}
