package day04.静态代理;

/**
 * @Description: 代理类 @Author: thog @Date: 2022/10/21 16:21
 */
public class SmsProxy implements SmsService {

  private final SmsService smsService;

  public SmsProxy(SmsService smsService) {
    this.smsService = smsService;
  }

  @Override
  public String send(String message) {
    System.out.println("调用方法前");
    smsService.send(message);
    System.out.println("调用方法后");
    return message;
  }

  public static void main(String[] args) {
    SmsService smsService = new SmsServiceImpl();
    SmsProxy smsProxy = new SmsProxy(smsService);
    smsProxy.send("Java");
  }
}
