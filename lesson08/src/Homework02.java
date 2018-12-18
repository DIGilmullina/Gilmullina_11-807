import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int maxInd = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sumString = 0;
            for (int j = 0; j < m; j++) {
                sumString += mat[i][j];
            }
            if (sumString > maxSum) {
                maxSum = sumString;
                maxInd = i;
            }
        }
        int maxInd2 = 0;
        maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            int sumCol = 0;
            for (int j = 0; j < n; j++) {
                sumCol += mat[j][i];
            }
            if (sumCol > maxSum) {
                maxSum = sumCol;
                maxInd2 = i;
            }
        }

        for (int i = 0; i < m; i++) {
            System.out.print(mat[maxInd][i] + " ");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print(mat[i][maxInd2] + " ");
            
        }
    }
}
