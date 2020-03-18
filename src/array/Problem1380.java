package array;

import java.util.LinkedList;
import java.util.List;

/**
 * 给你一个 m * n 的矩阵，矩阵中的数字 各不相同 。请你按 任意 顺序返回矩阵中的所有幸运数。
 * 幸运数是指矩阵中满足同时下列两个条件的元素：
 * 在同一行的所有元素中最小
 * 在同一列的所有元素中最大
 * 示例 1：
 * 输入：matrix = [[3,7,8],[9,11,13],[15,16,17]]
 * 输出：[15]
 * 解释：15 是唯一的幸运数，因为它是其所在行中的最小值，也是所在列中的最大值。
 * 提示：
 * m == mat.length
 * n == mat[i].length
 * 1 <= n, m <= 50
 * 1 <= matrix[i][j] <= 10^5
 * 矩阵中的所有元素都是不同的
 */
public class Problem1380 {
    public static List<Integer> luckyNumbers (int[][] matrix) {
        /**
         * 执行用时 :2 ms, 在所有 Java 提交中击败了95.35%的用户
         * 内存消耗 :41.9 MB, 在所有 Java 提交中击败了100.00%
         * 的用户
         */
        List<Integer>list=new LinkedList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int []rawMin = new int[m];
        int[] ColMax=new int[n];
        for (int i=0;i<m;i++){
            int min=matrix[i][0];
            for (int j=1;j<n;j++){
                if (matrix[i][j]<min){
                    min=matrix[i][j];
                }
            }
            rawMin[i]=min;
        }
        for (int j=0;j<n;j++){
            int max=matrix[0][j];
            for (int i=0;i<m;i++){
                if (matrix[i][j]>max){
                    max=matrix[i][j];
                }
            }
            ColMax[j]=max;
        }
        for (int i=0;i<rawMin.length;i++){
            for (int j=0;j<ColMax.length;j++){
                if (rawMin[i]==ColMax[j]){
                    list.add(rawMin[i]);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int [][]arr=new int[][]{{3,7,8},{9,11,13},{15,16,17}};
        List<Integer>list=luckyNumbers(arr);
    }
}
