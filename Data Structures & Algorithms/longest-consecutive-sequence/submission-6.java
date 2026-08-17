class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        TreeSet<Integer> ts = new TreeSet<>();
        for (int num : nums){
            ts.add(num);
        }

        int count = 0;
        int maxCount = 0;
        Integer prev = ts.first()-1;
        for (Integer num: ts){
            if (num != prev+1){
                count = 1;
                prev = num;
                continue;
            }
            else {
                count ++;
            }
            if (count > maxCount){
                maxCount = count;
            }
            prev = num;
        }
        return maxCount;
    }
}
