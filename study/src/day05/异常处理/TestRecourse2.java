package day05.异常处理;

import java.io.*;

/**
 * @Description: @Author: thog @Date: 2022/10/27 11:32
 */
public class TestRecourse2 {

  public static void main(String[] args) {
    //
    try (BufferedInputStream bin =
            new BufferedInputStream(new FileInputStream(new File("test.txt")));
         BufferedOutputStream bout =
            new BufferedOutputStream(new FileOutputStream(new File("out.txt")))) {
      int b;
      while ((b = bin.read()) != -1) {
        bout.write(b);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
