import java.util.Scanner;

public class homework04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        System.out.println("Выберите регистр u/l");
        String check = sc.next();
        if (check.equals("u")) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 'a' && arr[i] <= 'z') {
                    arr[i] = (char) (arr[i] - 32);
                }
            }
        }
        if (check.equals("l"))
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 'A' && arr[i] <= 'Z') {
                    arr[i] = (char) (arr[i] + 32);
                }
            }
        s = "";
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
        }
        System.out.println(s);
    }
}
