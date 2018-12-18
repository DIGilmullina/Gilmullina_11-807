import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double k=stepen(n);
        if(k==1){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }

    static double stepen(double k) {
        if (k == 1) {
            return 1;
        } else if (k < 1) {
            return 0;
        } else {
            k = stepen(k / 2);
            return k;
        }
    }
}
