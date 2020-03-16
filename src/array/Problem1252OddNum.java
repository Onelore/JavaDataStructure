package array;

/**
 * 给你一个 n 行 m 列的矩阵，最开始的时候，每个单元格中的值都是 0。
 *
 * 另有一个索引数组 indices，indices[i] = [ri, ci] 中的 ri 和 ci 分别表示指定的行和列（从 0 开始编号）。
 *
 * 你需要将每对 [ri, ci] 指定的行和列上的所有单元格的值加 1。
 *
 * 请你在执行完所有 indices 指定的增量操作后，返回矩阵中 「奇数值单元格」 的数目。
 *
 */
public class Problem1252OddNum {
    public static int oddCells(int n, int m, int[][] indices) {
        int[] rows = new int[n];
        int[] cols = new int[m];
        for (int i = 0; i < indices.length; i++) {
            rows[indices[i][0]]++;
            cols[indices[i][1]]++;
        }
        int colEven = 0, colOdd = 0, result = 0;
        for (int i = 0; i < m; i++) {
            if ((cols[i] & 1) == 1) {
                colOdd++;
            } else {
                colEven++;
            }
        }
        for (int i = 0; i < n; i++) {
            if ((rows[i] & 1) == 1) {   //第i行加1的次数为奇数次，那么该行中对应加1的次数为偶数次的列上的数是奇数
                result += colEven;
            } else {
                result += colOdd;   //第i行加1的次数为偶数次，那么该行中对应加1的次数为奇数次的列上的数是奇数
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][]num=new int[][]{{0,1},{1,1}};
        int n=2;
        int m=3;
        oddCells(n,m,num);

    }
}
