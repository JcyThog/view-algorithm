package day04.静态代理;

/**
 * @Description: 实现类
 * @Author: thog
 * @Date: 2022/10/21 16:17
 */
public class SmsServiceImpl implements SmsService {

  @Override
  public String send(String message) {
    System.out.println("实现类");
    return message;
  }
}
