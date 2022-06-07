class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String check = String.valueOf(c);
            
            if(map.containsKey(check)){
                map.get(check).add(s);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(check,list);
            }
        }
        
        for(String key : map.keySet()){
            res.add(map.get(key));
        }
        
        return res;
    }
}