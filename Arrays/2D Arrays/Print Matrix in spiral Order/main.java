import java.util.*;

class SpiralMatrixII {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result[][] = spiralMatrixII(n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] spiralMatrixII(int n) {


        int [][] result = new int[n][n];
        int rowBegin = 0;
        int colBegin = 0;
        int rowEnd = n-1;
        int colEnd = n-1;

        int count = 1;
        while(count <= n*n){

        for(int i =colBegin;i<=rowEnd && count <= n*n;i++){
            result[rowBegin][i] = count++;
        }
        rowBegin++;
        for(int i=rowBegin;i<=colEnd && count <= n*n;i++){

            result[i][rowEnd] = count++;
        }
        rowEnd--;
        for(int i=rowEnd;i>=colBegin && count <= n*n;i--){

            result[colEnd][i] = count++;
        }
        colEnd--;
        for(int i=colEnd; i>=rowBegin && count <= n*n;i--){

            result[i][colBegin] = count++;
        }
        colBegin++;

    }
    return result;

    }
}
