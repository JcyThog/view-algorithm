package day01.字符串反转;

import java.util.Scanner;

/**
 * @Description: 字符串反转
 * @Author: thog
 * @Date: 2022/8/3 17:09
 */
public class Reverse {

  public static String rev(String s) {
    int length = s.length();
    StringBuffer result = new StringBuffer(length);
    for (int i = length - 1; i >= 0; i--) result.append(s.charAt(i));
    return result.toString();
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入字符串：");
    String s = scanner.next();
    System.out.println("输出结果："+rev(s));
  }
}
