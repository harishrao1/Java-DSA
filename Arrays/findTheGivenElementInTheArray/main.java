import java.util.*;

class FindElement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int x = sc.nextInt();

        int result = findElement(n, arr, x);

        System.out.println(result);

    }

    static  int findElement(int n, int[] arr, int x) {

        for(int j=0;j<n;j++){
            if(arr[j]==x){
                return j;
            }
        }
        return -1;
    }
}
