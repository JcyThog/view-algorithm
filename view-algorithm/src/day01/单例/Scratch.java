package day01.单例;

import java.util.concurrent.*;

/**
 * @Description: 线程安全 测试
 * @Author: thog
 * @Date: 2022/8/3 14:33
 */
public class Scratch {

  public static void main(String[] args) throws ExecutionException, InterruptedException {

      Callable<SingletonL> c = new Callable<SingletonL>() {
          @Override
          public SingletonL call() throws Exception {
              return SingletonL.getInstance();
          }
      };

      ExecutorService service = Executors.newFixedThreadPool(2);
      Future<SingletonL> f1 = service.submit(c);
      Future<SingletonL> f2 = service.submit(c);

      SingletonL singleton1 = f1.get();
      SingletonL singleton2 = f2.get();

    System.out.println(singleton1);
    System.out.println(singleton2);

    service.shutdown();
  }
}
