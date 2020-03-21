package array;

/**
 * 斐波那契数，通常用 F(n) 表示，形成的序列称为斐波那契数列。
 * 该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。
 * 也就是：
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 * 给定 N，计算 F(N)。
 * 示例 1：
 * 输入：2
 * 输出：1
 * 解释：F(2) = F(1) + F(0) = 1 + 0 = 1.
 * 示例 2：
 * 输入：3
 * 输出：2
 * 解释：F(3) = F(2) + F(1) = 1 + 1 = 2.
 * 示例 3：
 * 输入：4
 * 输出：3
 * 解释：F(4) = F(3) + F(2) = 2 + 1 = 3.
 * 提示：
 * 0 ≤ N ≤ 30
 */
public class Problem509 {
    public static int fib(int N) {
        /**
         * 递归调用
         * 复杂度分析
         * 时间复杂度：O(2^N)。这是计算斐波那契数最慢的方法。因为它需要指数的时间。
         * 空间复杂度：O(N)，在堆栈中我们需要与 N 成正比的空间大小。该堆栈跟踪 fib(N) 的函数调用，随着堆栈的不断增长如果没有足够的内存则会导致 StackOverflowError。
         */
//        if (N>1){
//            return fib(N-1)+fib(N-2);
//        }
//        else
//            return N;

        /**
         * 2、
         * 复杂度分析
         *
         * 时间复杂度：O(N)。
         * 空间复杂度：O(N)  ，使用了空间大小为 N 的数组。
         */
        if (N<=1){
            return N;
        }
        return memoize(N);

    }

    private static int memoize(int N) {
        int []cache=new int[N+1];
        cache[1]=1;
        for (int i=2;i<=N;i++){
            cache[i]=cache[i-1]+cache[i-2];
        }
        return cache[N];
    }

    public static void main(String[] args) {
        System.out.println(fib(30));
    }
}
