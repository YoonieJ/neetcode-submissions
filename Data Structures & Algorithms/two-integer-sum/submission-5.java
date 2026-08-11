class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        // Big O: O(n^2)
        // for (int i=0; i<nums.length; i++){
        //     int diff = target-nums[i];
        //     for (int j= i+1; j<nums.length; j++){
        //         if (nums[j]==diff){
        //             result[0] = i;
        //             result[1] = j;
        //             return result;
        //         }
        //     }
        // }
        // // not found
        // return result;

        // Big O: O(n)
        int i=0;
        int j=1;
        while (i< nums.length){
            // loop complete for given i
            if (j>=nums.length){
                i++;
                j = i+1;
            }
            // found solution
            if (nums[i] + nums[j] == target){
                result[0] = i;
                result[1] = j;
               return result;
            }
            else{
                j++;
            }
        }
        // not found
        return result;
    }
}
