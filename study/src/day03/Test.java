package day03;

/**
 * @Description:
 * @Author: thog
 * @Date: 2022/9/17 21:18
 */
public class Test {

  public static void main(String[] args) {
    int fac = fac(4);
    System.out.println(fac);
  }

  static int fac(int n) {
    int s = 1;
    for (int i=1; i<=n; i++) {
      s*=i;
    }
    return s;
  }

  public static int main() {
    int i = 0;
    System.out.println("Hello World!");
    return i;
  }
}
