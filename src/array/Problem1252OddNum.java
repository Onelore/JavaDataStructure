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
        int[] row=new int[n];
        int[] col=new int[m];

        for(int i=0;i<indices.length;i++) {
            row[indices[i][0]]++;
            col[indices[i][1]]++;
        }

        int ans=0;
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++) {
                if((row[i]+col[j])%2>0)
                    ans++;
            }
        return ans;

    }

    public static void main(String[] args) {
        int[][]num=new int[][]{{0,1},{1,1}};
        int n=2;
        int m=3;
        System.out.println(oddCells(n,m,num));

    }
}
