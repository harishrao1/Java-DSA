 public int lengthOfLongestSubstringKDistinct(String s, int k) {

        //Brute Force

        int answer = 0;
        for(int i = 0;i<s.length()-1;i++){
            HashSet<Character> result = new HashSet<>();
            for(int j = i;j<=s.length()-1;j++){
                result.add(s.charAt(j));
                
            // System.out.println("Size of result :"+ result.size());
                if(result.size() == k){
                    answer = Math.max(answer,j-i+1);
                    // System.out.println("ansewr :" + answer);
                }
            }
        }
        return answer;
