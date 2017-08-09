import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Abror on 11.05.2017.
 */
public class Travels {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num_test_cases = in.nextInt();
        for (int i = 0; i < num_test_cases; i++) {
            int num_cities = in.nextInt();
            Set<String> cities = new HashSet<>();
            for(int j = 0; j<num_cities; j++){
                cities.add(in.next());
            }
            System.out.println(cities.size());
        }
    }

}
