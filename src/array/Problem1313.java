package array;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个以行程长度编码压缩的整数列表 nums 。
 * 考虑每对相邻的两个元素 [freq, val] = [nums[2*i], nums[2*i+1]] （其中 i >= 0 ），
 * 每一对都表示解压后子列表中有 freq 个值为 val 的元素，你需要从左到右连接所有子列表以生成解压后的列表。
 * 请你返回解压后的列表。
 * 示例：
 * 输入：nums = [1,2,3,4]
 * 输出：[2,4,4,4]
 * 解释：第一对 [1,2] 代表着 2 的出现频次为 1，所以生成数组 [2]。
 * 第二对 [3,4] 代表着 4 的出现频次为 3，所以生成数组 [4,4,4]。
 * 最后将它们串联到一起 [2] + [4,4,4] = [2,4,4,4]。
 * 示例 2：
 * 输入：nums = [1,1,2,3]
 * 输出：[1,3,3]
 *
 * 提示：
 * 2 <= nums.length <= 100
 * nums.length % 2 == 0
 * 1 <= nums[i] <= 100
 */
public class Problem1313 {
    public static int[] Decode(int[] nums){
        /**1、执行用时 :60 ms, 在所有 Java 提交中击败了5.06%的用户
         * 内存消耗 :41.9 MB, 在所有 Java 提交中击败了100.00%的用户
         * LinkedList linkedList=new LinkedList<>();
         *         for (int i=0;i<nums.length;i++){
         *             if ((i+1)%2==0){
         *                 for (int j=nums[i-1];j>0;j--){
         *                     linkedList.add(nums[i]);
         *                 }
         *             }
         *         }
         *         int[]result=new int[linkedList.size()];
         *         for (int i=0;i<linkedList.size();i++){
         *             result[i]= (int) linkedList.get(i);
         *         }
         *         return result;
         */
        /**
         * 2、
         * 执行用时 :5 ms, 在所有 Java 提交中击败了46.18%的用户
         * 内存消耗 :41.4 MB, 在所有 Java 提交中击败了100.00%的用户
         */
        List<Integer>list=new ArrayList<>();
        for (int i=1;i<nums.length;i+=2){
            for (int j=nums[i-1];j>0;j--){
                list.add(nums[i]);
            }
        }
        int []result=new int[list.size()];
        for (int i=0;i<result.length;i++){
            result[i]=list.get(i);
        }
        return result;



    }

    public static void main(String[] args) {
        int[]list=new int[]{1,2,3,4};
        int[] linkedList=Decode(list);
        for (int i=0;i<linkedList.length;i++){
            System.out.println(linkedList[i]);
        }
    }
}
