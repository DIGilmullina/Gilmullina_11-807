import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        n = sc.nextInt();
        int[] arr2 = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println(uniqueCount(arr,arr2) + uniqueCount(arr2,arr));
    }

    public static int uniqueCount(int[] arr, int[] arr2) {
        int k = 0;
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            for (j = 0; j < arr2.length; j++) {
                if (arr[i] == arr2[j]) break;
            }
            if (j == arr2.length) k++;
        }
        return k;
    }
}