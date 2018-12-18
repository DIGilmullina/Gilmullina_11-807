import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        int m=-1;
        int max=0;
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
            if (Math.abs(ar[i]) > max) {
                max = Math.abs(ar[i]);
                m = i;
            }
        }
        System.out.print(m);
    }
}