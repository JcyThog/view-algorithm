package day04.JDK动态代理;

/**
 * @Description: 实现发送短信的接口
 * @Author: thog
 * @Date: 2022/10/21 16:46
 */
public class SmsServiceImpl implements SmsService{

    @Override
    public String send(String message) {
        System.out.println("动态代理：实现类");
        return message;
    }
}
