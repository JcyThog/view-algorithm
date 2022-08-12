package day02;

/**
 * @Description: 测试
 * @Author: thog
 * @Date: 2022/8/10 11:15
 */
public class TestVolatile implements Runnable {

  @Override
  public void run() {
    VolatileVO v = new VolatileVO();
    v.setI(v.getI() + v.getJ());
  }

  TestVolatile vo = new TestVolatile();
  Thread t1 = new Thread(vo);
  Thread t2 = new Thread(vo);
}
