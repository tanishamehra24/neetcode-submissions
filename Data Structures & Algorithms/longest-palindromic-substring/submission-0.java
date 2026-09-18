class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int start = 0;
        int end = 0;
        for (int i = 0; i <= n - 1; i++) {
            int even = expand(s, i, i + 1);
            int odd = expand(s, i, i);
             if (odd > end - start + 1) {
                start = i - (odd - 1) / 2;
                end = i + (odd - 1) / 2;
            }
            if (even > end - start + 1) {
                start = i - (even / 2) + 1;
                end = i + (even / 2);
            }
        }
        return s.substring(start, end + 1);
    }
    public int expand(String s, int left, int right) {
        while (left >= 0 && right <= s.length() - 1 && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
