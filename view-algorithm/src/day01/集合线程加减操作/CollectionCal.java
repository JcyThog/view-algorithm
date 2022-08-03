package day01.集合线程加减操作;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Description: 4个线程做集合加减
 * @Author: thog
 * @Date: 2022/8/3 14:49
 */
public class CollectionCal implements Runnable {

  private static Integer count = 0;

  private static List<Integer> list = Collections.synchronizedList(new ArrayList<>());

  @Override
  public void run() {
    if (Thread.currentThread().getName().startsWith("add")) {
      count++;
      list.add(count);
    } else {
      list.remove(count);
      count--;
    }
  }

  public static void main(String[] args) throws InterruptedException {

    CollectionCal cal = new CollectionCal();
    Thread t1 = new Thread(cal, "add01");
    Thread t2 = new Thread(cal, "add02");
    Thread t3 = new Thread(cal, "mul03");
    Thread t4 = new Thread(cal, "mul04");

    t1.start();
    t1.join();
    System.out.println(list);

    t2.start();
    t2.join();
    System.out.println(list);

    t3.start();
    t3.join();
    System.out.println(list);

    t4.start();
    t4.join();
    System.out.println(list);
  }
}
