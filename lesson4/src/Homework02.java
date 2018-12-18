import java.util.Arrays;
import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int k = sc.nextInt();

        char[] arr1 = str.toCharArray();
        char arr[] = new char[arr1.length];
        for(int i = 0; i < arr.length; i++) {
            arr[(i + k) % arr.length] = arr1[i];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr));
    }
}
