package day05.异常处理;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @Description: @Author: thog @Date: 2022/10/27 11:30
 */
public class TestRecourse1 {

  public static void main(String[] args) {
    //
    try (Scanner scanner = new Scanner(new File("test.txt"))) {
      while (scanner.hasNext()) {
        System.out.println(scanner.nextLine());
      }
    } catch (FileNotFoundException fnfe) {
      fnfe.printStackTrace();
    }
  }
}
