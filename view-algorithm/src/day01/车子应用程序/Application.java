package day01.车子应用程序;


/**
 * @Description: 应用程序
 * @Author: thog
 * @Date: 2022/8/3 17:26
 */
public class Application {

  public static void main(String[] args) {
      Driver driver = new Driver();
      Thread t1 = new Thread(driver);
      t1.start();
  }
}
