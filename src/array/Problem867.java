package array;

import java.util.Arrays;

/**
 * 给定一个矩阵 A， 返回 A 的转置矩阵。
 * 矩阵的转置是指将矩阵的主对角线翻转，交换矩阵的行索引与列索引。
 * 示例 1：
 * 输入：[[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[[1,4,7],[2,5,8],[3,6,9]]
 * 示例 2：
 * 输入：[[1,2,3],[4,5,6]]
 * 输出：[[1,4],[2,5],[3,6]]
 * 提示：
 * 1 <= A.length <= 1000
 * 1 <= A[0].length <= 1000
 */
public class Problem867 {
    public static int[][] transpose(int[][] A) {
        /**
         * 复杂度分析
         * 时间复杂度：O(R * C)，其中 R 和 C是给定矩阵 A 的行数和列数。
         * 空间复杂度：O(R * C)，也就是答案所使用的空间。
         */
        int m=A.length;
        int n=A[0].length;
        int[][]ts=new int[n][m];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                ts[j][i]=A[i][j];
            }
        }
        return ts;
    }

    public static void main(String[] args) {
        int [][]arr=transpose(new int[][]{{1,2,3},{4,5,6}});
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++)
                System.out.print(arr[i][j]);
            System.out.println();
        }
    }
}
