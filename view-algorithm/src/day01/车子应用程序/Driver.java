package day01.车子应用程序;

import java.math.BigDecimal;

/**
 * @Description: 司机
 * @Author: thog
 * @Date: 2022/8/3 17:19
 */
public class Driver implements Runnable {

  @Override
  public void run() {
    Car car = new Car();
    car.setBrand("一条龙");
    car.setNumber(1);
    car.setWeight(BigDecimal.valueOf(60));
    car.setWheels(4);
    Car.Engine engine = car.getEngine();
    engine.start();
    System.out.println("牌子："+car.getBrand());
    System.out.println("人数："+car.getNumber());
    System.out.println("车重："+car.getWeight());
    System.out.println("轮胎数："+car.getWheels());
    engine.stop();
  }

}
