package day02;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: thog
 * @Date: 2022/8/10 15:49
 */
public class TestRef {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        List<Integer> l2 = new ArrayList<>();
        l2.add(2);
        TestRef.swap(l1, l2);
        System.out.println(l1);
        System.out.println(l2);
    }

    public static void swap(List<Integer> x, List<Integer> y) {
        List<Integer> temp = x;
        x = y;
        y = temp;
        System.out.println(x);
        System.out.println(y);
    }
}
