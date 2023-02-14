package 并发;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @Description: 异步回调处理 @Author: thog @Date: 2023/1/13 16:43
 */
public class AsyncDeal01 {

  //  public static void main(String[] args) throws ExecutionException, InterruptedException {
  //    // 测试回调
  //    CompletableFuture<Integer> cf1 =
  //        CompletableFuture.supplyAsync(
  //            () -> {
  //              System.out.println(Thread.currentThread() + "cf1 do something");
  //              return 1;
  //            });
  //
  //    CompletableFuture<Object> cf2 =
  //        cf1.thenApplyAsync(
  //            (result) -> {
  //              System.out.println(Thread.currentThread() + "cf2 do something");
  //              result += 2;
  //              return result;
  //            });
  //    System.out.println("cf1结果->" + cf1.get());
  //    System.out.println("cf2结果->" + cf2.get());
  //  }

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    //
    CompletableFuture<Integer> cf1 =
        CompletableFuture.supplyAsync(
            () -> {
              System.out.println(Thread.currentThread() + "cf1 do");
              return 1;
            });

    CompletableFuture<Integer> cf2 =
        cf1.thenApply(
            (result) -> {
              System.out.println(Thread.currentThread() + "cf2 do");
              result += 2;
              return result;
            });

    System.out.println("cf1结果->" + cf1.get());
    System.out.println("cf2结果->" + cf2.get());
  }

  // thenApply和thenApplyAsync区别在于，
  // 使用thenApply方法时子任务与父任务使用的是同一个线程，而thenApplyAsync在子任务中是另起一个线程执行任务，
  // 并且thenApplyAsync可以自定义线程池，默认的使用ForkJoinPool.commonPool()线程池。

}
