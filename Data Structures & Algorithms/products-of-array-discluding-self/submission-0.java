class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int first = 1;

        // set result[i] = product of nums[0] to nums[i-1]
        for (int i=0; i<nums.length; i++){
            result[i] = first;
            first *= nums[i];
        }

        int second = 1;

        // set result[i] = first * product of nums[i+1] to nums[nums.length]
        for (int i = nums.length - 1; i >= 0; i--){
            result[i] *= second;
            second *= nums[i];
        }
        return result;
    }
}  
