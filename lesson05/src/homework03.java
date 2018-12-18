import java.util.Scanner;

public class homework03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toCharArray();
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            k = k*10 + arr[i]-48;
        }
        System.out.println(k);
    }
}
