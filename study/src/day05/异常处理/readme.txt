try: 用于捕获异常。其后可接零个或多个 `catch` 块，如果没有 `catch` 块，则必须跟一个 `finally` 块。
catch: 用于处理 try 捕获到的异常。
finally: 无论是否捕获或处理异常，`finally` 块里的语句都会被执行。当在 `try` 块或
         `catch` 块中遇到 `return` 语句时，`finally` 语句块将在方法返回之前被执行。

**在以下 3 种特殊情况下，`finally` 块不会被执行：**

1. 在 `try` 或 `finally`块中用了 `System.exit(int)`退出程序。但是，如果 `System.exit(int)` 在异常语句之后，
   `finally` 还是会被执行。
2. 程序所在的线程死亡。
3. 关闭 CPU。

**注意：** 当 try 语句和 finally 语句中都有 return 语句时，
在方法返回之前，finally 语句的内容将被执行，并且 finally 语句的返回值将会覆盖原始的返回值。

