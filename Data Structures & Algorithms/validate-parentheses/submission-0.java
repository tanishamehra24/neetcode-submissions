class Solution {
    public boolean isValid(String s) {
        char [] stack = new char[s.length()];
        int top = -1;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
           if(ch == '(' || ch == '[' || ch == '{'){
              stack[++top] = ch;
           }else{
            if(top != -1 && isComplete(stack[top], ch)){
                top--;
            }else{
                return false;
             }
           }
        }
        return top == -1;
        
    }
    public boolean isComplete(char top, char curr){
        if(top == '(' && curr == ')') return true;
       else if(top == '[' && curr == ']') return true;
       else if(top == '{' && curr == '}') return true;
       else return false;
    }
}
