
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Abror on 09.07.2017.
 */
public class stacking_cups {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int num_cups = in.nextInt();
        in.nextLine();
        int[] output = new int[num_cups];
        Map<Integer, String> result = new HashMap<>();
        for (int i = 0; i < num_cups; i++) {
            String inputLine = in.nextLine();
            String s[] = inputLine.split(" ");
            try {
                int number = Integer.parseInt(s[0]);
                output[i] = number/2;
                result.put(number/2, s[1]);
            } catch (NumberFormatException ignored) {
                output[i] = Integer.parseInt(s[1]);
                result.put(Integer.parseInt(s[1]), s[0]);
            }
        }
        Arrays.sort(output);
        for(int i = 0; i<num_cups; i++){
            System.out.println(result.get(output[i]));
        }
    }

}
