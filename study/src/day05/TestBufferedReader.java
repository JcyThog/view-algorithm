package day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Description: @Author: thog @Date: 2022/10/27 10:41
 */
public class TestBufferedReader {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String s = reader.readLine();
    System.out.println("获取："+s);
  }
}
