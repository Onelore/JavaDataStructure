package array;

import java.util.Arrays;

/**
 * 给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
 * 示例 1：
 * 输入: s1 = "abc", s2 = "bca"
 * 输出: true
 * 示例 2：
 * 输入: s1 = "abc", s2 = "bad"
 * 输出: false
 * 说明：
 * 0 <= len(s1) <= 100
 * 0 <= len(s2) <= 100
 */
public class Interview0102 {
    public static boolean CheckPermutation(String s1, String s2) {
        /**1、暴力法
         * 执行用时 :0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗 :37.7 MB, 在所有 Java 提交中击败了100.00%的用户
         */
        char[]ch1=s1.toCharArray();
        char[]ch2=s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return new String(ch1).equals(new String(ch2));


    }

    public static void main(String[] args) {
        System.out.println(CheckPermutation("/abc","b/ca"));
    }
}
