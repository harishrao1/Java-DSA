import java.util.*;

// Input -> language
//output -> 4

class CountVowels {
  
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int vowels = countVowels(str);
        System.out.println(vowels);
    }

     static boolean isVowel(char ch)
    {
        ch = Character.toUpperCase(ch);
       if(ch=='A' || ch=='E' || ch=='I' ||
            ch=='O' || ch=='U'){
           return true;
           }
       else{ 
           return false;
       }
    }
  
    static int countVowels(String str) {

        int count = 0;
        for(char ch : str.toCharArray()){
            if(isVowel(ch) == true){

                count++;
            }
        }
        return count;


        // System.out.println(result);
    }
}
