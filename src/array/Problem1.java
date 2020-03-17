package array;
import java.util.HashMap;
import java.util.Map;

/**
 * 1、两数之和
 * 给定一个整数数组和一个目标数组，找出数组中和为目标值的两个数
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用
 */
public class Problem1 {
    public static int[] twoSum(int[] nums,int target){
        /**1、直接暴力法
         * 复杂度分析：
         * 时间复杂度：O(n^2)
         * 对于每个元素，我们试图通过遍历数组的其余部分来寻找它所对应的目标元素，这将耗费 O(n)的时间。因此时间复杂度为 O(n^2)。
         * 空间复杂度：O(1)。
         *
         * for (int i=0;i<nums.length;i++){
         *             for (int j=i+1;j<nums.length;j++){
         *                 if (nums[j]==target-nums[i]){
         *                     return new int[]{i,j};
         *                 }
         *             }
         *         }
         *         return null;
         */

        /**
         * 复杂度分析：
         * 时间复杂度：O(n)，
         * 我们只遍历了包含有 n个元素的列表一次。在表中进行的每次查找只花费 O(1) 的时间。
         * 空间复杂度：O(n)，
         * 所需的额外空间取决于哈希表中存储的元素数量，该表最多需要存储 n 个元素。
         * 2、一遍哈希表(最快)
         *         Map<Integer,Integer> map=new HashMap<>();
         *         for (int i=0;i<nums.length;i++){
         *             int completed=target-nums[i];
         *             if (map.containsKey(completed)){
         *                 return new int[]{map.get(completed),i};
         *             }
         *             map.put(nums[i],i);
         *         }
         *          return null;
         */

        /**3、二遍哈希表()
         * 复杂度分析：
         * 时间复杂度：O(n)，
         * 我们把包含有 n个元素的列表遍历两次。由于哈希表将查找时间缩短到 O(1) ，所以时间复杂度为 O(n)。
         * 空间复杂度：O(n)，
         * 所需的额外空间取决于哈希表中存储的元素数量，该表中存储了 n个元素。
         */
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for (int i=0;i<nums.length;i++){
            int complete=target-nums[i];
            if (map.containsKey(complete)&&map.get(complete)!=i){
                return new int[]{i,map.get(complete)};
            }
        }
        return null;
    }


    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        int[] answer= twoSum(nums,target);
        System.out.println(answer[0]+" "+answer[1]);
    }
}
