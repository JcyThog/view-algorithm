package day01.车子应用程序;

import java.math.BigDecimal;

/**
 * @Description: 车
 * @Author: thog
 * @Date: 2022/8/3 17:14
 */
public class Car {

  /** 轮胎个数 */
  private Integer wheels;

  /** 车重 */
  private BigDecimal weight;

  /** 牌子 */
  private String brand;

  /** 人数 */
  private Integer number;

  public Integer getWheels() {
    return wheels;
  }

  public void setWheels(Integer wheels) {
    this.wheels = wheels;
  }

  public BigDecimal getWeight() {
    return weight;
  }

  public void setWeight(BigDecimal weight) {
    this.weight = weight;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  class Engine {

    public void start() {
      System.out.println("汽车启动......");
    }

    public void stop() {
      System.out.println("汽车关闭......");
    }
  }

  public Engine getEngine() {
    return new Engine();
  }
}
