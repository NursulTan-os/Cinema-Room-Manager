import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = -1;
        while ( (a = sc.nextInt()) != 0) {
            System.out.println(a % 2 == 0 ? "even" : "odd");
        }
    }
}