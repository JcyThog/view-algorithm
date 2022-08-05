package day03.拼接成一个新的有序数组;

/**
 * @Description: 实现一个函数, 把两个有序的整形数组拼接成一个新的有序数组, 并返回该数组
 * @Author: thog
 * @Date: 2022/8/5 16:56
 */
public class SplitArray {

  public static void split(int[] num1, int[] num2) {
    int p1 = 0;
    int p2 = 0;
    int p = 0;
    int[] res = new int[num1.length + num2.length];
    while (p1 < num1.length && p2 < num2.length) {
      res[p++] = num1[p1] < num2[p2] ? num1[p1++] : num2[p2++];
    }
    if (p1 < num1.length) {
      // 参数 ：复制来源数组，来源数组的开始下标，复制到的目标数组，目标数组的开始下标，复制的长度
      System.arraycopy(num1, p1, res, p1 + p2, num1.length + num2.length - p1 - p2);
    }

    if (p2 < num2.length) {
      System.arraycopy(num2, p2, res, p1 + p2, num1.length + num2.length - p1 - p2);
    }

    for (int i = 0; i < res.length; i++) {
      System.out.println(res[i]);
    }
  }

  public static void main(String[] args) {
    int[] a = {1, 4, 7};

    int[] b = {3, 6, 9, 11};

    split(b, a);
  }
}
