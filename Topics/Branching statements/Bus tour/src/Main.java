import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] bus = { sc.nextInt(), sc.nextInt() };
        int[] bridge = new int[bus[1]];
        boolean crash = false;
        int count = 0;
        for( int i = 0; i < bus[1]; i++) {
            bridge[i] = sc.nextInt();
        }
        while(count < bus[1]) {
            count++;
            if(bus[0] >= bridge[count-1]) {
                crash = true;
                System.out.println("Will crash on bridge " + count);
                break;
            }
        }
        if(!crash) {
            System.out.println("Will not crash");
        }
    }
}