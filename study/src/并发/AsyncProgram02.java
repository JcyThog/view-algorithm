package 并发;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description: 创建无返回的异步任务
 * @Author: thog
 * @Date: 2023/1/13 16:31
 */
public class AsyncProgram02 {

  //  public static void main(String[] args) throws ExecutionException, InterruptedException {
  //    // 测试
  //    CompletableFuture<Void> completableFuture =
  //        CompletableFuture.runAsync(
  //            () -> {
  //              System.out.println("do something");
  //            });
  //    // 等待任务执行完成
  //    System.out.println("结果->" + completableFuture.get());
  //  }

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    ExecutorService executorService = Executors.newSingleThreadExecutor();
    CompletableFuture<Void> completableFuture =
        CompletableFuture.runAsync(
            () -> {
              System.out.println("do something");
            }, executorService);

    System.out.println("结果->" + completableFuture.get());
  }
}
