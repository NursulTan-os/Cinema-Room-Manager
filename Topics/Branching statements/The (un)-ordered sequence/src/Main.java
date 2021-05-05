import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = -1;
        boolean seq;
        int vector = 0;
        int counter = 0;
        while(input != 0) {
            input = sc.nextInt();
            int cmpr = input;
            while(input != 0) {
                input = sc.nextInt();
                if(input == 0) {
                    break;
                }
                if (input > cmpr) {
                    vector++;
                    counter++;
                } else if (input < cmpr) {
                    vector--;
                    counter++;
                }
                cmpr = input;
            }
            seq = counter == Math.abs(vector);
            System.out.println(seq);
        }
    }
}