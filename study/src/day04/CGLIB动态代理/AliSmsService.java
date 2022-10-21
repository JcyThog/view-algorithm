package day04.CGLIB动态代理;

/**
 * @Description: AliSmsService
 * @Author: thog
 * @Date: 2022/10/21 17:49
 */
public class AliSmsService {

    public String send(String message) {
        System.out.println("阿里云发消息: "+message);
        return message;
    }
}
