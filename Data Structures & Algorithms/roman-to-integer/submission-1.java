class Solution {
    public int romanToInt(String s) {
        int result = 0; //initialize result with 0
        for(int i = 0; i < s.length() - 1; i++){ //parse through the given string
            int curr = getValue(s.charAt(i)); //get the integer value of the curr char
            int next = getValue(s.charAt(i + 1)); //get the integer value of the corresponding char
            if(curr < next){ //if the curr is less than next char (EX: IV or XL)
                result-= curr; //subtract the curr char from the result ( In case of IV, res - 1 = -1)
            }else{
                result+=curr; //else just add the curr char
            }
        }
        //after loop finishes running, add the last char value as loop only runs till s.length() - 1 i.e the last char
        result += getValue(s.charAt(s.length()-1)); 
        return result; //return the result
    }
    //helper function to get the value of each Char
    public int getValue(char ch){
        switch(ch){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
}