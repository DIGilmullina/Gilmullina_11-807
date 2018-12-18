import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String s = sc.nextLine();
        System.out.println("Введите n1: ");
        int n1 = sc.nextInt();
        System.out.println("Введите n2: ");
        int n2 = sc.nextInt();
        StringBuffer s1 = new StringBuffer(s);
        s1.delete(n1,n2 + 1);
        System.out.println("Ваша строка: " + s1);
    }
}
