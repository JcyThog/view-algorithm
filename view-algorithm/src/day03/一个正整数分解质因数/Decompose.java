package day03.一个正整数分解质因数;

import java.util.Scanner;

/**
 * @Description: 将一个正整数分解质因数
 * @Author: thog
 * @Date: 2022/8/5 17:02
 */
public class Decompose {

    // n代表需要输入的正整数
    static int n, k = 2;

    public static void main(String[] args) {
        System.out.print("请输入一个大于2的正整数：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(n + "=");
        Decompose decompose = new Decompose();
        decompose.f(n);
    }

    public void f(int n) {
        while (k <= n) {
            if (k == n) {
                System.out.print(n);
                break;
            } else if (n > k && n % k == 0) {
                System.out.print(k + "*");
                n = n / k;
                f(n);
                break;
            } else if (n > k && n % k != 0) {
                k++;
                f(n);
                break;
            }
        }
    }
}
