class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        HashMap<Character, Integer> freq = new HashMap<>();
        int i = 0, j = 0;
        while(j < s.length()){
            char chJ = s.charAt(j);
            freq.put(chJ, freq.getOrDefault(chJ, 0) + 1);
            while(freq.get(chJ) > 1){
                freq.put(s.charAt(i), freq.get(s.charAt(i)) - 1);
                i++;
            }
            max = Math.max(max, j - i + 1);
            j++;
        }
      return max;
    }
}
