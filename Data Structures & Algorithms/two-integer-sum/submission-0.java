class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if(seen.containsKey(nums[i])){
                int r = seen.get(nums[i]);
                return new int[] {r, i};
            }
            int complement = target - nums[i];
            seen.put(complement, i);
        }
        return new int[]{0,0};
    }
}
