package my.home.leetcode;

public class Palindrome {

/*
   Given an integer x, return true if x is a palindrome, and false otherwise.
    Example 1:
    Input: x = 121
    Output: true
    Explanation: 121 reads as 121 from left to right and from right to left.
  */

    public static void main(String[] args) {
        boolean isPalindromeTest = isPalindrome(121434121);
    }

    static boolean isPalindrome(int x) {
        String word = String.valueOf(x);
        int length = word.length();
        for (int i = 0; i < (length / 2); i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
