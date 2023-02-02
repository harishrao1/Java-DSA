//Find the Average height

// 'n' is No of students and 
// float a[] --> height of each student in an array

// output --> should have 5 decimals
import java.util.*;


class AverageHeight{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float a[] = new float[n];

        for(int i = 0; i < n; i++)
        {
            a[i] = Float.parseFloat(sc.next());
        }

        float avgHeight = averageHeight(n, a);
        System.out.println(avgHeight);
    }

    static float averageHeight(int n, float[] a){

         float sum = 0;
        for(float i : a){
          sum += i;
        }
        return sum/n;
    }
}
