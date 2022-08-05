package day03.求1000以内的所有质数;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 求1000以内的所有质数，并且各位数字之和是偶数
 * @Author: thog
 * @Date: 2022/8/5 16:40
 */
public class Prime {

  public static boolean isPrime(int num) { // 判断是否素数
    if (num <= 1) return false;
    for (int i = 2; i * i <= num; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static boolean isEvenSum(int num) { // 判断各数位之和是否偶数
    int sum = 0;
    while (num != 0) {
      sum += num % 10;
      num /= 10;
    }
    if (sum % 2 != 0) {
      return false;
    }
    return true;
  }

  public static void main(String[] args) {

    int[] num = new int[1000];
    for (int i = 0; i < 1000; i++) {
      num[i] = i;
    }
    for (int i = 0; i < 1000; i++) {
      if (isPrime(num[i]) && isEvenSum(num[i])) {
        System.out.println(num[i]);
      }
    }
  }
}
