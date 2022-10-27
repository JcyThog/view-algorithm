package day05.反射;

/**
 * @Description: 反射 操作的目标对象
 * @Author: thog
 * @Date: 2022/10/27 14:21
 */
public class TargetObject {

    private String value;

    public TargetObject() {
        value = "江江~";
    }

    public void publicMethod(String s) {
        System.out.println("I love " + s);
    }

    private void privateMethod() {
        System.out.println("value is " + value);
    }
}
