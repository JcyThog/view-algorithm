package day01.计算器;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @Description: 计算器 实现加减乘除
 * @Author: thog
 * @Date: 2022/8/3 15:13
 */
public class Calculate {

  private static BigDecimal count = BigDecimal.ZERO;

  private static Boolean flag = Boolean.TRUE;

  public static void main(String[] args) {
    System.out.println("输入+进行加法运算");
    System.out.println("输入-进行减法运算");
    System.out.println("输入*进行乘法运算");
    System.out.println("输入/进行除法运算");
    System.out.println("输入q退出计算");
    System.out.println("输入c清零");
    Scanner scanner = new Scanner(System.in);

    while (flag) {
      BigDecimal i = BigDecimal.ZERO;
      BigDecimal j = BigDecimal.ZERO;
      System.out.println("请输入操作类型：");
      String s = scanner.next();
      if (!s.equals("q") && !s.equals("c")) {
        if (!count.equals(BigDecimal.ZERO)) {
          i = count;
        }else {
          System.out.println("请输入第一个数：");
          i = scanner.nextBigDecimal();
        }
        System.out.println("请输入第二个数：");
        j = scanner.nextBigDecimal();
      }
      switch (s) {
        case "+":
          count = i.add(j);
          break;
        case "-":
          count = i.subtract(j);
          break;
        case "*":
          count = i.multiply(j);
          break;
        case "/":
          count = i.divide(j, 2, BigDecimal.ROUND_HALF_UP);
          break;
        case "q":
          scanner.close();
          flag = Boolean.FALSE;
          System.out.println("计算结束");
          break;
        case "c":
          count = BigDecimal.ZERO;
          break;
      }
      System.out.println("计算结果："+count);
    }

  }
}
