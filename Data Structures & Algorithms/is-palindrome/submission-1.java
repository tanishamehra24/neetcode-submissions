class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            //this means while left < right and character is not a letter or digit, skip it
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            //this means while right > left and character is not a letter or digit, skip it
            while(right > left && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            //lower case the characters
            if(Character.toLowerCase(s.charAt(left))!= Character.toLowerCase(s.charAt(right))){
                return false;
            }else{
                left++;
                right--;
            }
        }
        return true;
    }
}
