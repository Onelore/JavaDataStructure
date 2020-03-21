package array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。
 * 对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。
 * 你可以返回任何满足上述条件的数组作为答案。
 * 示例：
 * 输入：[4,2,5,7]
 * 输出：[4,5,2,7]
 * 解释：[4,7,2,5]，[2,5,4,7]，[2,7,4,5] 也会被接受。
 * 提示：
 * 2 <= A.length <= 20000
 * A.length % 2 == 0
 * 0 <= A[i] <= 1000
 */
public class Problem922 {
    public static int[] sortArrayByParityII(int[] A) {
        /**
         * 1、
         */
//        List<Integer> list=new ArrayList<>();
//        for (int i:A){
//            if (i%2==0){
//                list.add(i);
//            }
//        }
//        int a=1;
//        for (int i=0;i<A.length;i++){
//            if (A[i]%2!=0){
//                list.add(a,A[i]);
//                a+=2;
//            }
//        }
//        for(int i=0;i<A.length;i++){
//            A[i]=list.get(i);
//        }
//        return A;

        /**
         * 2、
         */
        int j=1;
        for (int i=0;i<A.length;i+=2){
            if (A[i]%2==1){
                while (A[j]%2==1){
                    j+=2;
                }
                int tmp=A[i];
                A[i]=A[j];
                A[j]=tmp;
            }
        }
        return A;


    }

    public static void main(String[] args) {
        int[]arr=sortArrayByParityII(new int[]{4,2,5,7});
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
