class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i) - 'a']++;
        }
        int i = 0, j = 0;
        while (j < s2.length()) {
            int k = s1.length();
            freq2[s2.charAt(j) - 'a']++;
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                if (Arrays.equals(freq1, freq2)) {
                    return true;
                } else {
                    freq2[s2.charAt(i) - 'a']--;
                    i++;
                    j++;
                }
            }
        }
        return false;
    }
}
