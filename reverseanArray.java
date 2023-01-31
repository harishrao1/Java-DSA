public class reverseanArray {
    public static void main(String[] args){

        int[] hello = {1,2,3,4,5};
        
        reverse(hello);
        // System.out.println(reverse(arr));
    }

     static int[] reverse(int arr[]){

        for(int i = 0;i<arr.length/2;i++){

            int temp = arr[i];

            arr[i] = arr[arr.length-i-1];

            arr[arr.length-i-1] = temp;
            System.out.println(temp);
        }
        // System.out.println(temp);
        return arr;
    }
}
