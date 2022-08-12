package day02;

/**
 * @Description:
 * @Author: thog
 * @Date: 2022/8/10 14:20
 */
public class TestE {

  public static void main(String[] args) {
//    String a = new String("ab"); // a 为一个引用
//    String b = new String("ab"); // b为另一个引用,对象的内容一样
//    String aa = "ab"; // 放在常量池中
//    String bb = "ab"; // 从常量池中查找
//
//    System.out.println(aa==bb);
//
//    System.out.println(a==b);
//
//    System.out.println(a.equals(b));
//    if (42 == 42.0) { // true
//      System.out.println("true");
//    }

    Integer i1 = 10;
    Integer i2 = 128;
    Integer j = new Integer(10);
    Integer k = Integer.valueOf(10);
    Integer l = Integer.valueOf(128);

    System.out.println(i1 == j); //false
    System.out.println(i1.equals(j)); //true

    System.out.println(i1 == k); //true

    System.out.println(i2 == l); //false
    System.out.println(i2.equals(l)); //true
  }
}
