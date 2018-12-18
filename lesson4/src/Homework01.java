import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов первого массива: ");
        int n = sc.nextInt();
        String arr1 = "",arr2 = "";
        System.out.println("Введите элементы первого массива: ");
        for (int i = 0; i < n; i++) {
            arr1 = arr1 + sc.nextInt();
        }
        System.out.println("Введите количество элементов второго массива: ");
        int m = sc.nextInt();
        System.out.println("Введите элементы второго массива: ");
        for (int i = 0; i < m; i++) {
            arr2 = arr2 + sc.nextInt();
        }
        int a = arr1.indexOf(arr2);
        if (a > -1){
            System.out.println("Входит, начиная с индекса : " + a);
        } else{
            System.out.println("Не входит");
        }

    }
}
