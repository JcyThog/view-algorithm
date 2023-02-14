package 并发;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @Description: 回调处理 无入参 无返回值 @Author: thog @Date: 2023/1/13 17:33
 */
public class AsyncRun01 {

  public static void main(String[] args) throws ExecutionException, InterruptedException {

    CompletableFuture<Integer> cf1 = CompletableFuture.supplyAsync(() -> {
      System.out.println(Thread.currentThread() + "cf1 do");
      return 1;
    });

//    CompletableFuture<Void> cf2 = cf1.thenRun(() -> {
//      System.out.println(Thread.currentThread() + "cf2 do");
//    });
    CompletableFuture<Void> cf2 = cf1.thenRunAsync(() -> {
      System.out.println(Thread.currentThread() + "cf2 do");
    });

    System.out.println("cf1结果->" + cf1.get());
    System.out.println("cf2结果->" + cf2.get());
  }
}
