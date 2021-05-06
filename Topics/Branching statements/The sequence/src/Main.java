import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int k = 0;
        a = sc.nextInt();
        while (a > 0) {
            k++;
            int t = k;
            while(t > 0 && a > 0) {
                System.out.print(k + " ");
                t--;
                a--;
            }
        }
    }
}