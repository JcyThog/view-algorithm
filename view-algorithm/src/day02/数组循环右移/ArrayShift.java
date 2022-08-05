package day02.数组循环右移;

/**
 * @Description: 数组循环右移
 * @Author: thog
 * @Date: 2022/8/4 16:53
 */
public class ArrayShift {

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,7};
        int n = 3;
        int len = arr.length;
        int cur = arr[0];
        int index = 0;
        int newIndex = 0;
        int temp = cur;
        for(int i = 0 ; i < len ; i++) {
            newIndex = (index+n)%len;
            cur =  arr[newIndex];//更新当前值
            arr[newIndex] = temp;//保存上一个数
            temp = cur;
            index = newIndex;
        }
        for(int i : arr) {
            System.out.print(i+" ");
        }

    }
}
