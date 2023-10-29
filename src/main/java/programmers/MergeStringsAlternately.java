package programmers;

import java.util.Arrays;

public class MergeStringsAlternately {

    public static void main(String[] args) {
        String s = mergeAlternately("  a   b   c", "    p   q   r");
//        String s = mergeAlternately("abc", "pqr");
        System.out.println(s);
    }

    /**
     * 두 문자열 번갈아 병합
     * https://leetcode.com/problems/merge-strings-alternately/?envType=study-plan-v2&envId=leetcode-75
     * word1:  a   b   c
     * word2:    p   q   r
     * merged: a p b q c r
     *
     * @param word1
     * @param word2
     * @return
     */
    public static String mergeAlternately(String word1, String word2) {
//        String replaceAll = (word1 + word2).replaceAll(" ", "");
        String replaceAll = (word1 + word2).trim();
        int loop = Math.max(word1.length(), word2.length());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < replaceAll.length()-1; i++) {
            if (i < word1.length()) {
                sb.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                sb.append(word2.charAt(i));
            }
        }
        return sb.toString();
    }
}
