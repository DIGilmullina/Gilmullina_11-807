import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        String s = "";
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            s += arr[i];
        }
        int x = Integer.parseInt(s);

        System.out.println(x);
    }
}
