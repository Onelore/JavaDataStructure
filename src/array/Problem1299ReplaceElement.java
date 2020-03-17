package array;

/**
 * 给你一个数组 arr ，请你将每个元素用它右边最大的元素替换，如果是最后一个元素，用 -1 替换。
 * 完成所有替换操作后，请你返回这个数组。
 * 示例：
 * 输入：arr = [17,18,5,4,6,1]
 * 输出：[18,6,6,6,1,-1]
 * 提示：
 * 1 <= arr.length <= 10^4
 * 1 <= arr[i] <= 10^5
 */
public class Problem1299ReplaceElement {
    public static int[] replaceElements(int[] arr) {

        /**
         * 1、
         * 执行用时 :325 ms, 在所有 Java 提交中击败了5.03%的用户
         * 内存消耗 :43.5 MB, 在所有 Java 提交中击败了5.14%的用户
         * for (int i=0;i<arr.length;i++){
         *             int rightMax=-1;
         *             for (int j=i+1;j<arr.length;j++){
         *                 if (rightMax<arr[j]){
         *                     rightMax=arr[j];
         *                     arr[i]=arr[j];
         *                 }
         *             }
         *
         *         }
         *         arr[arr.length-1]=-1;
         *         return arr;
         */

        /**
         * 2、
         */
        int max=-1;
        for (int i=arr.length-1;i>=0;i--){
            int temp=arr[i];
            arr[i]=max;
            if (temp>max){
                max=temp;
            }
//            max=Math.max(max,temp);

        }
        return arr;


    }

    public static void main(String[] args) {
        int []num=replaceElements(new int[]{20,18,5,4,6,1});
        for (int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
    }
}
