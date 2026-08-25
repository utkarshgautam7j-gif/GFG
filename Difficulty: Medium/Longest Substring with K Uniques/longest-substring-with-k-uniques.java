class Solution {
    public int longestKSubstr(String s, int k) {

        HashMap<Character, Integer> map = new HashMap<>();
        int j = 0;
        int max = 0;
        int len = 0;

        for (int i = 0; i < s.length(); i++) {

            if (map.size() <= k) {

                map.put(s.charAt(i),
                        map.getOrDefault(s.charAt(i), 0) + 1);

                len = i - j + 1;
            }

            else {
                for (int l = j; l < i; l++) {

                    map.put(s.charAt(l), map.get(s.charAt(l)) - 1);

                    if (map.get(s.charAt(l)) == 0) {
                        map.remove(s.charAt(l));
                        j = l + 1;
                        break;
                    }
                }

                // add current character
                map.put(s.charAt(i),
                        map.getOrDefault(s.charAt(i), 0) + 1);

                len = i - j + 1;
            }

            if (map.size() == k) {
                max = Math.max(len, max);
            }
        }

        if (max == 0) return -1;

        return max;
    }
}