package array;

/**
 * 给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。
 * 水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。
 * 反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。
 * 示例 1:
 * 输入: [[1,1,0],[1,0,1],[0,0,0]]
 * 输出: [[1,0,0],[0,1,0],[1,1,1]]
 * 解释: 首先翻转每一行: [[0,1,1],[1,0,1],[0,0,0]]；
 *      然后反转图片: [[1,0,0],[0,1,0],[1,1,1]]
 * 示例 2:
 * 输入: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
 * 输出: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * 解释: 首先翻转每一行: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]]；
 *      然后反转图片: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * 说明:
 * 1 <= A.length = A[0].length <= 20
 * 0 <= A[i][j] <= 1
 */
public class Problem832 {
    public static int[][] flipAndInvertImage(int[][] A) {
        /**1、
         * 执行用时 :1 ms, 在所有 Java 提交中击败了68.54%的用户
         * 内存消耗 :41.5 MB, 在所有 Java 提交中击败了5.16%的用户
         * for (int i=0;i<A.length;i++){
         *             for (int j=0;j<A[i].length/2;j++){
         *                 int temp=A[i][j];
         *                 A[i][j]=A[i][A[i].length-j-1];
         *                 A[i][A[i].length-j-1]=temp;
         *             }
         *         }
         *         for (int i=0;i<A.length;i++){
         *             for (int j=0;j<A[i].length;j++){
         *                 if (A[i][j]==1){
         *                     A[i][j]=0;
         *                 }else {
         *                     A[i][j]=1;
         *                 }
         *             }
         *         }
         *         return A;
         */

        /**
         * 2、
         * 复杂度分析
         * 时间复杂度：O(M*N)，其中 M 和 N分别为数组 A 的行数和列数。
         * 空间复杂度：O(1)。
         *
         * 执行用时 :0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗 :41 MB, 在所有 Java 提交中击败了5.46%的用户
         */
        int C=A[0].length;
        for (int[]row:A){
            for (int i=0;i<(C+1)/2;i++){
                int temp=row[i]^1;
                row[i]=row[C-1-i]^1;
                row[C-1-i]=temp;
            }
        }
        return A;



    }

    public static void main(String[] args) {
        int[][]num=new int[][]{{1,1,0},{1,0,1},{0,0,0}};
        int [][]arr=flipAndInvertImage(num);
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
