import java.util.Scanner;

public class homework02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String k = sc.nextLine();
        char[] arr = k.toCharArray();
        k = "";
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] >= '0' && arr[i] <= '9'){
                arr[i] = '*';
            }
            k += arr[i];
        }
        System.out.println(k);
    }
}
