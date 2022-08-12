package day02;

/**
 * @Description:
 * @Author: thog
 * @Date: 2022/8/10 11:02
 */
public class VolatileVO {

  private volatile int i = 1;

  private volatile int j = 10;

  public int getI() {
    return i;
  }

  public void setI(int i) {
    this.i = i;
  }

  public int getJ() {
    return j;
  }

  public void setJ(int j) {
    this.j = j;
  }
}
