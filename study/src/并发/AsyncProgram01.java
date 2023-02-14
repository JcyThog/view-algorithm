package 并发;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description: 创建有返回的异步任务
 * @Author: thog
 * @Date: 2023/1/13 16:10
 */
public class AsyncProgram01 {

  //  public static void main(String[] args) throws ExecutionException, InterruptedException {
  //    //测试 CompletableFuture
  //    CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
  //      System.out.println("do something");
  //      return "result";
  //    });
  //    // 等待任务执行完成
  //    System.out.println("结果->" + completableFuture.get());
  //  }

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    // 自定义线程池
    ExecutorService executorService = Executors.newSingleThreadExecutor();
    CompletableFuture<String> completableFuture =
        CompletableFuture.supplyAsync(
            () -> {
              System.out.println("do something");
              return "result";
            }, executorService);

    // 等待子任务执行完成
    System.out.println("结果->" + completableFuture.get());
  }


}
