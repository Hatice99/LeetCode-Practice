class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            str = new String(charArray);

            if (!map.containsKey(str)) {
                map.put(str, result.size());
                result.add(new ArrayList<>());
            }

            result.get(map.get(str)).add(strs[i]);

        }
        return result;

    }
}