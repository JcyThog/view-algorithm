package day02;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 泛型
 * @Author: thog
 * @Date: 2022/8/10 14:02
 */
public class TestT {

  static List<Integer> list = new ArrayList<>();

  public static void add() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
    list.add(12);
//    list.add("a");
    Class<? extends List> listClass = list.getClass();
    Method add = listClass.getDeclaredMethod("add", Object.class);
    add.invoke(list, "a");
  }



  public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
    add();
    System.out.println(list);
  }
}
