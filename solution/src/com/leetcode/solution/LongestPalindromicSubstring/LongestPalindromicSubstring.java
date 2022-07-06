package com.leetcode.solution.LongestPalindromicSubstring;

/**
 * 5. 最长回文子串
 * English Version
 *
 * 题目描述
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 *
 *
 *
 * 示例 1：
 *
 * 输入：s = "babad"
 * 输出："bab"
 * 解释："aba" 同样是符合题意的答案。
 * 示例 2：
 *
 * 输入：s = "cbbd"
 * 输出："bb"
 *
 *
 * 提示：
 *
 * 1 <= s.length <= 1000
 * s 仅由数字和英文字母组成
 * 解法
 * 动态规划法。
 *
 * 设 dp[i][j] 表示字符串 s[i..j] 是否为回文串。
 *
 * 当 j - i < 2，即字符串长度为 2 时，只要 s[i] == s[j]，dp[i][j] 就为 true。
 * 当 j - i >= 2，dp[i][j] = dp[i + 1][j - 1] && s[i] == s[j]。
 */
public class LongestPalindromicSubstring {

    public static String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int mx = 1, start = 0;
        for (int j = 0; j < n; ++j) {
            for (int i = 0; i <= j; ++i) {
                if (j - i < 2) {
                    dp[i][j] = s.charAt(i) == s.charAt(j);
                } else {
                    dp[i][j] = dp[i + 1][j - 1] && s.charAt(i) == s.charAt(j);
                }
                if (dp[i][j] && mx < j - i + 1) {
                    mx = j - i + 1;
                    start = i;
                }
            }
        }
        return s.substring(start, start + mx);
    }


    public static void main(String[] args) {
        longestPalindrome("sss");
    }
}
