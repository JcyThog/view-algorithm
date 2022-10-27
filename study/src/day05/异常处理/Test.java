package day05.异常处理;

/**
 * @Description: @Author: thog @Date: 2022/10/27 11:22
 */
public class Test {
  public static int f(int value) {
    try {
      return value * value;
    } finally {
      if (value == 2) {
        return 0;
      }
    }
  }

  public static void main(String[] args) {
    //
    int f = f(2);
    System.out.println(f);
  }
}
