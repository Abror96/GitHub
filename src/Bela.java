
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Abror on 26.05.2017.
 */
public class Bela {

    public static void main(String[] args) {

        Map<String, Integer> dominant = new HashMap<String, Integer>();
        dominant.put("A", 11);
        dominant.put("K", 4);
        dominant.put("Q", 3);
        dominant.put("J", 20);
        dominant.put("T", 10);
        dominant.put("9", 14);
        dominant.put("8", 0);
        dominant.put("7", 0);

        Map<String, Integer> notDominant = new HashMap<String, Integer>();
        notDominant.put("A", 11);
        notDominant.put("K", 4);
        notDominant.put("Q", 3);
        notDominant.put("J", 2);
        notDominant.put("T", 10);
        notDominant.put("9", 0);
        notDominant.put("8", 0);
        notDominant.put("7", 0);

        int total = 0;

        Scanner in = new Scanner(System.in);
        int num_hands = in.nextInt();
        String domin_suit = in.next();
        String[] cards = new String[num_hands*4];
        for (int i = 0; i<num_hands*4; i++){
            cards[i] = in.next();
            if(cards[i].contains(domin_suit)){
                total += dominant.get(String.valueOf(cards[i].charAt(0)));
            } else {
                total += notDominant.get(String.valueOf(cards[i].charAt(0)));
            }
        }
        System.out.println(total);
    }

}
