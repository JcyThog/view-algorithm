package day02.使用递归的二分查找;

/**
 * @Description: 使用递归实现二分查找
 * @Author: thog
 * @Date: 2022/8/4 17:34
 */
public class RecursionHalve {

  /**
   * 使用递归的二分查找 title:recursionBinarySearch
   *
   * @param arr 有序数组
   * @param key 待查找关键字
   * @return 找到的位置
   */
  public static int recursionBinarySearch(int[] arr, int key, int low, int high) {

    if (key < arr[low] || key > arr[high] || low > high) {
      return -1;
    }

    int middle = (low + high) / 2; // 初始中间位置
    if (arr[middle] > key) {
      // 比关键字大则关键字在左区域
      return recursionBinarySearch(arr, key, low, middle - 1);
    } else if (arr[middle] < key) {
      // 比关键字小则关键字在右区域
      return recursionBinarySearch(arr, key, middle + 1, high);
    } else {
      return middle;
    }
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int key = 4;
    int low = 6;
    int high = 8;
    int search = recursionBinarySearch(arr, key, low, high);
    System.out.println(search);
  }
}
