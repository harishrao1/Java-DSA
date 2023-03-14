

import java.util.*;


class LongestValidParentheses{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int ans = longestValidParentheses(S);
        System.out.println(ans);
    }

    static int longestValidParentheses(String str){

        int n = str.length();

        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        int result = 0;

        for(int i =0;i<n;i++){
            
            if(str.charAt(i) == '('){
                stack.push(i);
            }
            else{
                if(!stack.empty()){
                    stack.pop();
                }

                if(!stack.empty()){
                    result = Math.max(result,i-stack.peek());
                }
                else{
                    stack.push(i);
                }
            }
        }
        return result;
    }
}
