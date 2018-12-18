import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n; //sc.nextInt();
        int c = n * m, i = 0, j = -1;
        int[][] matrix = new int[n][m];
        int k = 0;
        while (k < c) {
            while (j + 1 < m && matrix[i][j + 1] == 0) {
                j++;
                k++;
                matrix[i][j] = k;
            }
            while (i + 1 < n && matrix[i + 1][j] == 0) {
                i++;
                k++;
                matrix[i][j] = k;
            }
            while (j - 1 > -1 && matrix[i][j - 1] == 0) {
                j--;
                k++;
                matrix[i][j] = k;
            }
            while (i - 1 > -1 && matrix[i - 1][j] == 0) {
                i--;
                k++;
                matrix[i][j] = k;
            }
        }
        for (i = 0; i < n; i++) {
            System.out.println();
            for (j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }

        }
    }
}
