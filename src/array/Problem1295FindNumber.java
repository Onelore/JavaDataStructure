package array;
/**
 * 给你一个整数数组 nums，请你返回其中位数为 偶数 的数字的个数。
 * 示例 1：
 * 输入：nums = [12,345,2,6,7896]
 * 输出：2
 * 解释：
 * 12 是 2 位数字（位数为偶数） 
 * 345 是 3 位数字（位数为奇数）  
 * 2 是 1 位数字（位数为奇数） 
 * 6 是 1 位数字 位数为奇数） 
 * 7896 是 4 位数字（位数为偶数）  
 * 因此只有 12 和 7896 是位数为偶数的数字
 * 示例 2：
 *
 * 输入：nums = [555,901,482,1771]
 * 输出：1
 * 解释：
 * 只有 1771 是位数为偶数的数字。
 *
 * 提示：
 * 1 <= nums.length <= 500
 * 1 <= nums[i] <= 10^5
 */
public class Problem1295FindNumber {
    public static int findNumbers(int[] nums) {
        /**1、
         * 执行用时 :12 ms, 在所有 Java 提交中击败了5.61%的用户
         * 内存消耗 :40.8 MB, 在所有 Java 提交中击败了5.09%的用户
         * int count=0;
         *         for (int i=0;i<nums.length;i++){
         *             if ((nums[i]+"").length()%2==0){
         *                 count++;
         *             }
         *         }
         *         return count;
         */

        /**
         * 2、
         * 执行用时 :3 ms, 在所有 Java 提交中击败了33.29%的用户
         * 内存消耗 :39 MB, 在所有 Java 提交中击败了5.09%的用户
         *  int count=0;
         *         for (int i=0;i<nums.length;i++){
         *             int num=0;
         *             while (nums[i]!=0){
         *                 num++;
         *                 nums[i]/=10;
         *             }
         *             if (num%2==0){
         *                 count++;
         *             }
         *         }
         *         return count;
         */

        /**
         * 3、
         * 复杂度分析
         * 时间复杂度：O(N)，其中 N 是数组 nums 的长度。这里假设将整数转换为字符串的时间复杂度为 O(1)O。
         * 空间复杂度：O(1)。
         *
         */
        int count=0;
        for (int x:nums){
            if((x+"").length()%2==0){
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int []num=new int[]{12,345,2,6,7896};
        System.out.println(findNumbers(num));
    }
}
