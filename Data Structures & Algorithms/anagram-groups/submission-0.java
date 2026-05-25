class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> freq = new HashMap<>();
        List<List<String>> resultantList = new ArrayList<>();
        for (int i = 0; i < strs.length; i++){
            char[] key = strs[i].toCharArray();
            Arrays.sort(key);
            String result = new String(key);
            if(freq.containsKey(result)){
                List<String> list = freq.get(result);
                list.add(strs[i]);
                freq.put(result, list);
            }else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                freq.put(result,list);
            } 
        }

        for(List<String> value : freq.values()){
            resultantList.add(value);
        }

        return resultantList;

    }
}
