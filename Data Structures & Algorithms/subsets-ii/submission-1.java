class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);

        return result;  
    }

    private static void backtrack(int[] nums, int start, List<Integer> current, List<List<Integer>> result){
        List<Integer> dupeCheck = new ArrayList<>(current);
        Collections.sort(dupeCheck);
        if (!result.contains(dupeCheck)){
            result.add(new ArrayList<>(dupeCheck));
        }
        for (int i=start; i<nums.length; i++){
            current.add(nums[i]);
            backtrack(nums, i+1, current, result);
            current.remove(current.size()-1);
        }
    }
}
