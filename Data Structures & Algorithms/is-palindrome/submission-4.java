class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        String normalized = sb.toString();
        normalized = normalized.toLowerCase();

        int left = 0;
        int right = normalized.length()-1;
        while (left < right){
            if (normalized.charAt(left) != normalized.charAt(right)){
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }
}
