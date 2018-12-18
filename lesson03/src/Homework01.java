import java.util.Scanner;

public class Homework01 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int sr = 0;
        int k = 0;
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += arr[i];
        }
        sr = sum / n;
        for (int i = 0; i < n; i ++){
            if (arr[i] > sr) {
                k++;
            }
        }
        System.out.println( sr );
        System.out.println( k );
    }
}
