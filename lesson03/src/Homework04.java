import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int v = 0;
        arr[0] = sc.nextInt();
        for (int i = 1; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < arr[i - 1] && i < (n + 1) / 2 || arr[i] > arr[i - 1] && i > (n + 1) / 2) {
                v = -1;
                break;
            }
        }
        if (v == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
