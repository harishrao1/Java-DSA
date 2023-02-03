import java.util.*;

// Given a number, return the reverse of that number.

class ReverseNum {
  
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int reverse = reverseNum(num);

        System.out.println(reverse);

    }

    static int reverseNum(int num) {

        int reverse = 0;

        while(num > 0){
            reverse = reverse * 10 + num % 10;
            num = num/10;
        }
      //System.out.println(reverse);
        return reverse;
    }
}
