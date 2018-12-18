//Вариант 2
import java.util.Scanner;

public class ClassTestTask02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sum = s.charAt(0) - 48;
        for (int i = 1; i < s.length(); i = i + 2) {
            if (s.charAt(i)== '+'){
                sum += s.charAt(i + 1) - 48;
            }
            else {
                sum -= s.charAt(i +1) -48;
            }
        }
        System.out.println(sum);
    }
}
