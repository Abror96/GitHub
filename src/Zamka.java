import java.util.Scanner;

/**
 * Created by Abror on 27.05.2017.
 */
public class Zamka {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int d = in.nextInt();
        int x = in.nextInt();
        int m = 0;

        int i = l;
        while (i<=d){
            if(sumDigits(i) == x) {
                System.out.println(i);
                break;
            }
            i++;
        }
        i=0;
        while (i<=d){
            if(sumDigits(i) == x) {
                m = i;
            }
            i++;
        }
        System.out.println(m);
    }

    private static long sumDigits(long i) {
        return i == 0 ? 0 : i % 10 + sumDigits(i / 10);
    }

}
