package array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * 给你一份『词汇表』（字符串数组） words 和一张『字母表』（字符串） chars。
 * 假如你可以用 chars 中的『字母』（字符）拼写出 words 中的某个『单词』（字符串），那么我们就认为你掌握了这个单词。
 * 注意：每次拼写时，chars 中的每个字母都只能用一次。
 * 返回词汇表 words 中你掌握的所有单词的 长度之和。
 * 示例 1：
 * 输入：words = ["cat","bt","hat","tree"], chars = "atach"
 * 输出：6
 * 解释：
 * 可以形成字符串 "cat" 和 "hat"，所以答案是 3 + 3 = 6。
 * 示例 2：
 * 输入：words = ["hello","world","leetcode"], chars = "welldonehoneyr"
 * 输出：10
 * 解释：
 * 可以形成字符串 "hello" 和 "world"，所以答案是 5 + 5 = 10。
 *
 * 提示：
 * 1 <= words.length <= 1000
 * 1 <= words[i].length, chars.length <= 100
 * 所有字符串中都仅包含小写英文字母
 */
public class Problem1160 {
    public static int countCharacters(String[] words, String chars) {
//        chars = chars.trim();
        /**1、不符合题意://注意：每次拼写时，chars 中的每个字母都只能用一次。
         * HashSet<Character> set = new HashSet<>();
         *         for (int i = 0; i < chars.length(); i++) {
         *             set.add(chars.charAt(i));
         *         }
         *         int wordAns = 0;
         *         for (int i = 0; i < words.length; i++) {
         *             int count = 0;
         *             for (int j = 0; j < words[i].length(); j++) {
         *                 if (set.contains(words[i].charAt(j))) {
         *                     count++;
         *                 }
         *             }
         *             if (count == words[i].length()) {
         *                 wordAns += count;
         *             }
         *         }
         *         return wordAns;
         */

        /**
         * 2、
         * 执行用时 :7 ms, 在所有 Java 提交中击败了83.84%的用户
         * 内存消耗 :41.4 MB, 在所有 Java 提交中击败了5.08%的用户
         */
        int []vab=new int[26];
        for (char c:chars.toCharArray()){
            vab[(int)(c-'a')]++;
        }
        int res=0;
        a:for (String word:words){
            int []wordVab=new int[26];
            for (char w:word.toCharArray()){
                wordVab[(int)(w-'a')]++;
            }
            for (int i=0;i<26;i++){
                if (wordVab[i]>vab[i]){
                    continue a;
                }
            }
            res+=word.length();
        }
        return res;
    }


    public static void main(String[] args) {
        int a=  countCharacters(new String[]{"dyiclysmffuhibgfvapygkorkqllqlvokosagyelotobicwcmebnpznjbirzrzsrtzjxhsfpiwyfhzyonmuabtlwin","ndqeyhhcquplmznwslewjzuyfgklssvkqxmqjpwhrshycmvrb","ulrrbpspyudncdlbkxkrqpivfftrggemkpyjl","boygirdlggnh","xmqohbyqwagkjzpyawsydmdaattthmuvjbzwpyopyafphx","nulvimegcsiwvhwuiyednoxpugfeimnnyeoczuzxgxbqjvegcxeqnjbwnbvowastqhojepisusvsidhqmszbrnynkyop","hiefuovybkpgzygprmndrkyspoiyapdwkxebgsmodhzpx","juldqdzeskpffaoqcyyxiqqowsalqumddcufhouhrskozhlmobiwzxnhdkidr","lnnvsdcrvzfmrvurucrzlfyigcycffpiuoo","oxgaskztzroxuntiwlfyufddl","tfspedteabxatkaypitjfkhkkigdwdkctqbczcugripkgcyfezpuklfqfcsccboarbfbjfrkxp","qnagrpfzlyrouolqquytwnwnsqnmuzphne","eeilfdaookieawrrbvtnqfzcricvhpiv","sisvsjzyrbdsjcwwygdnxcjhzhsxhpceqz","yhouqhjevqxtecomahbwoptzlkyvjexhzcbccusbjjdgcfzlkoqwiwue","hwxxighzvceaplsycajkhynkhzkwkouszwaiuzqcleyflqrxgjsvlegvupzqijbornbfwpefhxekgpuvgiyeudhncv","cpwcjwgbcquirnsazumgjjcltitmeyfaudbnbqhflvecjsupjmgwfbjo","teyygdmmyadppuopvqdodaczob","qaeowuwqsqffvibrtxnjnzvzuuonrkwpysyxvkijemmpdmtnqxwekbpfzs","qqxpxpmemkldghbmbyxpkwgkaykaerhmwwjonrhcsubchs"},
        "usdruypficfbpfbivlrhutcgvyjenlxzeovdyjtgvvfdjzcmikjraspdfp");
//        int a=countCharacters(new String[]{"cat","bt","hat","tree"},  "atach");
        System.out.println(a);


    }
}
