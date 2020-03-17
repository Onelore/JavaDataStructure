package array;

import java.util.*;

/**
 * 给你一个整数 n，请你返回 任意 一个由 n 个 各不相同 的整数组成的数组，并且这 n 个数相加和为 0 。
 * 示例 1：
 * 输入：n = 5
 * 输出：[-7,-1,1,3,4]
 * 解释：这些数组也是正确的 [-5,-1,1,2,3]，[-3,-1,2,-2,4]。
 * 示例 2：
 * 输入：n = 3
 * 输出：[-1,0,1]
 * 示例 3：
 * 输入：n = 1
 * 输出：[0]
 * 提示：
 * 1 <= n <= 1000
 */
public class Problem1304 {
    public static int[] sumZero(int n) {
        /**
         * int []num=new int[n];
         *         int sum=0;
         *         for (int i=0;i<num.length-1;i++){
         *             num[i]=i;
         *             sum+=i;
         *         }
         *         num[n-1]=-sum;
         *         return num;
         */
        int[]num=new int[n];
        int m=0;
        for (int i=0;i<n/2;i++){
            num[m++]=-(i+1);
            num[m++]=i+1;
        }
        return num;


    }

    public static void main(String[] args) {
        int[]sum=sumZero(1);
        for (int i=0;i<sum.length;i++){
            System.out.println(sum[i]);
        }

    }
}
