import java.util.Scanner;

/**
 * Created by Abror on 28.05.2017.
 */
public class Sum_digits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean end = false;
        int n;
        do {
            n = in.nextInt();
            if(n==0) end = true;
            else {
                for (int m = 11; true; m++) {
                    if (sumDigits(n * m) == sumDigits(n)) {
                        System.out.println(m);
                        break;
                    }
                }
            }
        } while (!end);
    }

    private static int sumDigits(int i) {
        return i == 0 ? 0 : i % 10 + sumDigits(i / 10);
    }
}
