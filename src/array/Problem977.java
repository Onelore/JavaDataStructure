package array;

import java.util.Arrays;

/**
 * 给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
 * 示例 1：
 * 输入：[-4,-1,0,3,10]
 * 输出：[0,1,9,16,100]
 * 示例 2：
 * 输入：[-7,-3,2,3,11]
 * 输出：[4,9,9,49,121]
 * 提示：
 * 1 <= A.length <= 10000
 * -10000 <= A[i] <= 10000
 * A 已按非递减顺序排序。
 */
public class Problem977 {
    public static int[] sortedSquares(int[] A) {
        /**
         * 1、Arrays自带排序
         * 复杂度分析
         *
         * 时间复杂度：O(N log N)，其中 NN 是数组 A 的长度。
         * 空间复杂度：O(N)。
         * 执行用时 :2 ms, 在所有 Java 提交中击败了92.69%的用户
         * 内存消耗 :42.8 MB, 在所有 Java 提交中击败了5.17%的用户
         */
        for (int i=0;i<A.length;i++){
            A[i]*=A[i];
        }
        Arrays.sort(A);
        return A;





    }

    public static void main(String[] args) {
        int []a=sortedSquares(new int[]{-7,-3,2,3,11});
        System.out.println(Arrays.toString(a));

    }

}
