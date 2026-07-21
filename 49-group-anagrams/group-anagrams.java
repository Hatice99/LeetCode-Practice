class Solution {
            public String sortString(String s){
            char[] array = s.toCharArray();
            Arrays.sort(array);

            String sorted = new String(array);

            return sorted;
        }
    public List<List<String>> groupAnagrams(String[] strs) {



        List<List<String>> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        int counter = 0;
        for(String str: strs){
            String sorted_str = sortString(str);

            if(map.containsKey(sorted_str)){
                list.get(map.get(sorted_str)).add(str);
            }
            else{
                map.put(sorted_str, counter);
                List <String> group = new ArrayList<>();
                group.add(str);
                list.add(group);
                counter++;

            }

        }return list;
        
    }
    
}