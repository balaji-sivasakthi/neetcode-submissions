class Solution {
    public boolean isAnagram(String s, String t) {
       if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> frq1 = new HashMap<>();
        Map<Character, Integer> frq2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            frq1.put(
                s.charAt(i),
                frq1.getOrDefault(s.charAt(i), 0) + 1
            );

            frq2.put(
                t.charAt(i),
                frq2.getOrDefault(t.charAt(i), 0) + 1
            );
        }

        return frq1.equals(frq2);
    }
}
