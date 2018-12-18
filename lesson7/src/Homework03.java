public class Homework03 {
    public static void main(String[] args) {
        System.out.println(obratno(749));
    }

    public static int obratno(int k) {

        if (k < 10) {
            return k;
        } else {
            System.out.println(k % 10 + " ");
            return obratno(k / 10);
        }

    }
}
