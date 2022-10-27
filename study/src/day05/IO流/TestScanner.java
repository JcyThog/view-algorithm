package day05.IO流;

import java.util.Scanner;

/**
 * @Description: @Author: thog @Date: 2022/10/27 10:36
 */
public class TestScanner {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();
    String s1 = scanner.nextLine();
    System.out.println(s+s1);
    scanner.close();
  }
}
