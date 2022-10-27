package day05.异常处理;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @Description: @Author: thog @Date: 2022/10/27 11:29
 */
public class TestFinally {
  public static void main(String[] args) {
    // 读取文本文件的内容
    Scanner scanner = null;
    try {
      scanner = new Scanner(new File("D://read.txt"));
      while (scanner.hasNext()) {
        System.out.println(scanner.nextLine());
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } finally {
      if (scanner != null) {
        scanner.close();
      }
    }
  }
}
