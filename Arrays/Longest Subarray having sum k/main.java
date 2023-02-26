static int longestSubarrayHavingSumK(int n, int k, int arr[]){

            int maxLength = 0;
            int sum = 0;

            HashMap<Integer, Integer> map = new HashMap<>();

            for(int i=0;i<n;i++){

                sum = sum + arr[i];

                if(sum == k){
                    maxLength = i+1;
                }

                if(!map.containsKey(sum)){
                    map.put(sum,i);
                }

                if(map.containsKey(sum - k)){
                    if (maxLength < (i - map.get(sum - k))){

                        maxLength = i - map.get(sum - k);
                    }
                          
                }
            }
            return maxLength;
