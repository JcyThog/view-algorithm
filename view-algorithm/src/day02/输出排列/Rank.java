package day02.输出排列;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Description: 给定一个正整数n, 输出1到n的所有排列
 * @Author: thog
 * @Date: 2022/8/4 14:27
 */
public class Rank {

    private static Set<String> getRank(Integer n) {

        Set<String> set = new HashSet<>();
        if (1 == n) {
            set.add("1");
        } else {
            Set<String> oldSet = getRank(n - 1);
            // 遍历n-1时得到的结果
            for (String str : oldSet) {
                // 将每个字符串转为字符数组
                char[] oldArray = str.toCharArray();
                for (int i = 0; i < n; i++) {
                    char[] newArray = new char[n];
                    // 新数组是原数组插入n后的结果
                    for (int j = 0; j < n; j++) {
                        if (j < i) {
                            newArray[j] = oldArray[j];
                        } else if (j == i) {
                            newArray[j] = String.valueOf(n).charAt(0);
                        } else {
                            newArray[j] = oldArray[j - 1];
                        }
                    }
                    // 将数组转为字符串，存入集合
                    String s = String.valueOf(newArray);
                    set.add(s);
                }
            }
        }
        return set;
    }

  public static void main(String[] args) {
      Set<String> rank = getRank(3);
      System.out.println(rank);
      System.out.println(rank.size());
  }
}
