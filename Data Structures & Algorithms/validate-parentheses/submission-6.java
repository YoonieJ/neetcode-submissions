class Solution {
    public boolean isValid(String s) {
        // stack (ArrayDeque)
        if (s.length() %2 != 0){
            return false;
        }
        
        int idx = 0;
        Deque<Character> stack = new ArrayDeque<>();

        while (idx < s.length()){
            if (s.charAt(idx) == '(' || s.charAt(idx) == '{' || s.charAt(idx) == '[' ){
                stack.push(s.charAt(idx));
                idx ++;
            }
            else if (s.charAt(idx) == ')' || s.charAt(idx) == '}' || s.charAt(idx) == ']' ){
                if (stack.isEmpty()){
                    return false;
                }
                else {
                    Character popped = stack.pop();
                    if (popped == '(' && s.charAt(idx) == ')' || popped == '{' && s.charAt(idx) == '}' || popped == '[' && s.charAt(idx) == ']'){
                        idx ++;
                    }
                    else return false;
                }
            }
        }
        if (stack.isEmpty()){return true;}
        else return false;
    }
}
