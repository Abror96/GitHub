import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by Abror on 03.06.2017.
 */
public class Symmetric_order {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num_names;
        for (int k = 1; true; k++) {
            num_names = in.nextInt();
            if(num_names == 0) break;
            String[] names = new String[num_names];
            for (int i = 0, j = 0; i < num_names; ++i) {
                if (i % 2 != 0) {
                    names[num_names - j] = in.next();
                } else {
                    names[j++] = in.next();
                }
            }
            System.out.println("SET " + k);
            for (String name : names) System.out.println(name);
        }
    }
}
