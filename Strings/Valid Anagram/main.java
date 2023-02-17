
class Solution {
    public boolean isAnagram(String s, String t) {
        

      HashMap<Character, Integer> result = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            result.put(c,result.getOrDefault(c,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            if(result.get(c)!=null){
                if(result.get(c)==1){
                    result.remove(c);
                }else{
                    result.put(c,result.get(c)-1);
                }
            }else{
                return false;
            }
        }
        return result.isEmpty();  
    }
}

//Using hashTable
