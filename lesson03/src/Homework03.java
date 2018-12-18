import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        int k = 0;
        for (int i = 1; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        for (int i = 1; i < ar.length - 1; i++) {
            if ((ar[i] > ar[i + 1]) && (ar[i] > ar[i - 1])) {
                k = k + 1;
            }
        }
        System.out.print(k);
    }
}