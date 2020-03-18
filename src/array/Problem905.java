package array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 给定一个非负整数数组 A，返回一个数组，在该数组中， A 的所有偶数元素之后跟着所有奇数元素。
 * 你可以返回满足此条件的任何数组作为答案。
 * 示例：
 * 输入：[3,1,2,4]
 * 输出：[2,4,3,1]
 * 输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
 * 提示：
 * 1 <= A.length <= 5000
 * 0 <= A[i] <= 5000
 */
public class Problem905 {
    public  static int[] sortArrayByParity(int[] A) {
        /**1、
         * 复杂度分析
         * 时间复杂度：O(N)，其中 N是 A 的长度。
         * 空间复杂度：O(N)，存储结果的数组。
         * 执行用时 :1 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗 :41.2 MB, 在所有 Java 提交中击败了15.00%的用户
         */
//        int []sorted=new int[A.length];
//        int t=0;
//        for (int i=0;i<A.length;i++){
//            if (A[i]%2==0){
//                sorted[t++]=A[i];
//            }
//        }
//        for (int i=0;i<A.length;i++){
//            if (A[i]%2!=0){
//                sorted[t++]=A[i];
//            }
//        }
//        return sorted;
        /**
         * 2、
         * 复杂度分析
         * 时间复杂度：O(N)，其中 N 是 A 的长度。循环的每一步都让 j-i 至少减少了一。（注意虽然快排的复杂度是  O(NlogN)，但是我们只需要一轮扫描就可以了）。
         * 空间复杂度：O(1)，不需要额外空间。
         */
        int i=0,j= A.length-1;
        while (i<j){
            if (A[i]%2>A[j]%2){
                int tmp=A[i];
                A[i]=A[j];
                A[j]=tmp;
            }
            if (A[i]%2==0) i++;
            if (A[j]%2==1) j--;
        }
        return A;
    }

    public static void main(String[] args) {
        int[] a=sortArrayByParity(new int[]{3,1,2,4});
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
