class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            int currentFreq = freq.getOrDefault(nums[i], 0) + 1;
            freq.put(nums[i], currentFreq);
        }
        for (int key: freq.keySet()){
            int value = freq.get(key);
            result.add(value);
        }
        int[] list = freq.entrySet()
                             .stream()
                             .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                             .mapToInt(Map.Entry::getKey)
                             .limit(k)
                             .toArray();
        return list;
    }
}
